package com.larecette.recipe.kafka;

import org.apache.kafka.common.Cluster;
import org.apache.kafka.clients.producer.Partitioner;

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

        if (KafkaRecipeEvent.class.isAssignableFrom(value.getClass())) {
            EventType eventType = ((KafkaRecipeEvent) value).getEventType();

           partition = eventToPartition.get(eventType);
        }
        return partition;
    }
    // This method will get called at the end and gives your partitioner class chance to cleanup
    public void close() {}
}