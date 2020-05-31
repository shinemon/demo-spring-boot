package com.mailshine.springboot.kafka.avro.serializer;

import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class AvroDeserializer<T extends SpecificRecordBase> implements Deserializer {
    @Override
    public void configure(Map configs, boolean isKey) {
        //do nothing
    }

    @Override
    public Object deserialize(String s, byte[] bytes) {
        return null;
    }

    @Override
    public void close() {
        //do nothing
    }
}
