package org.immunizer.acquisition.producer;

import org.apache.kafka.common.serialization.Serializer;
import com.google.gson.Gson;
import org.immunizer.acquisition.Invocation;

public class KafkaInvocationSerializer implements Serializer<Invocation> {

    private Gson gson = new Gson();

    public KafkaInvocationSerializer() {}
    
    @Override
    public byte[] serialize(String topic, Invocation invocation) {
        return gson.toJson(invocation).getBytes();
    }
}