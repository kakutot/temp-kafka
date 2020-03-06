package com.larecette.product.command.kafka;

import com.larecette.product.command.temp.EventType;
import com.larecette.product.command.temp.KafkaProductEvent;
import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.EnumMap;
import java.util.Map;

public class KafkaEventPartitioner implements Partitioner {
    private static Map<EventType, Integer> eventToPartition;

    public void configure(Map<String, ?> configs) {
        eventToPartition = new EnumMap<>(EventType.class);
        eventToPartition.put(EventType.CREATE, 0);
        eventToPartition.put(EventType.DELETE, 1);
        eventToPartition.put(EventType.UPDATE, 2);
    }

    //This method will get called once for each message
    public int partition(String topic,
                         Object key,
                         byte[] keyBytes,
                         Object value,
                         byte[] valueBytes,
                         Cluster cluster) {
        int partition = 0;

        if (KafkaProductEvent.class.isAssignableFrom(value.getClass())) {
            EventType eventType = ((KafkaProductEvent) value).getEventType();

           partition = eventToPartition.get(eventType);
        }
        return partition;
    }
    // This method will get called at the end and gives your partitioner class chance to cleanup
    public void close() {}
}