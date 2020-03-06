package com.larecette.product.command.controller;

import com.larecette.product.command.dto.SaveProductDto;
import com.larecette.product.command.kafka.KafkaProductEventProducer;
import com.larecette.product.command.model.Product;
import com.larecette.product.command.service.ProductService;
import com.larecette.product.command.temp.EventType;
import com.larecette.product.command.temp.KafkaProductEvent;
import com.larecette.product.command.temp.ProductKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping(value = "/admin/product/")
public class ProductController {

    @Autowired private ProductService productService;

    @Lazy
    @Autowired private KafkaProductEventProducer productEventProducer;

    @PostMapping
    public ResponseEntity<Product> addProduct(HttpServletRequest request, @RequestBody SaveProductDto productDto) {
        Product product = productService.createProduct(productDto.productFromDto());
        sendEventToKafka(product, EventType.CREATE);

        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Product> editProduct(HttpServletRequest request, @PathVariable(name = "id") UUID id, @RequestBody SaveProductDto productDto) {
        Product product = productService.editProduct(productDto, id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        sendEventToKafka(product, EventType.UPDATE);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteProduct(HttpServletRequest request, @PathVariable(name = "id") UUID id) {
        Boolean existed = productService.delete(id);
        if (existed) {
            Product product = new Product();
            product.setId(id);
            sendEventToKafka(product, EventType.CREATE);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Async
    void sendEventToKafka(Product product, EventType eventType) {
        final KafkaProductEvent kafkaProductEvent = new KafkaProductEvent(ProductKafka.fromProduct(product), eventType);
        productEventProducer.send(kafkaProductEvent);
    }
}
