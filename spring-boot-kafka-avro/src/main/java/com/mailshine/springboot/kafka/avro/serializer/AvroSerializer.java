package com.mailshine.springboot.kafka.avro.serializer;

import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

@Slf4j
public class AvroSerializer<T extends SpecificRecordBase> implements Serializer<T> {

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {
    // do nothing

  }

  @Override
  public byte[] serialize(String topic, T payload) {
    byte[] bytes = null;

    try {

      if (payload != null) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BinaryEncoder binaryEncoder =
                EncoderFactory.get().binaryEncoder(byteArrayOutputStream, null);

        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(payload.getSchema());
        datumWriter.write(payload, binaryEncoder);

        binaryEncoder.flush();
        byteArrayOutputStream.close();

        bytes = byteArrayOutputStream.toByteArray();
        //log.debug("serialized payload='{}'", DatatypeConverter.printHexBinary(bytes));
      }
    } catch (Exception e) {
      log.error("Unable to serialize payload ", e);
    }

    return bytes;
  }

  @Override
  public void close() {
    // do nothing
  }
}
