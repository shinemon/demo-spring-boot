//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mailshine.springboot.kafka.avro.model;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.ByteBuffer;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.Parser;
import org.apache.avro.data.RecordBuilder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.ResolvingDecoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.AvroGenerated;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.avro.specific.SpecificRecordBuilderBase;
import org.apache.avro.util.Utf8;

@AvroGenerated
public class SampleReferenceStudent extends SpecificRecordBase implements SpecificRecord {
    private static final long serialVersionUID = -888439186857538565L;
    public static final Schema SCHEMA$ = (new Parser()).parse("{\"type\":\"record\",\"name\":\"Student\",\"namespace\":\"com.mailshine.springboot.kafka.avro.model\",\"fields\":[{\"name\":\"studentName\",\"type\":\"string\"},{\"name\":\"studentId\",\"type\":\"string\"}]}");
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<SampleReferenceStudent> ENCODER;
    private static final BinaryMessageDecoder<SampleReferenceStudent> DECODER;
    /** @deprecated */
    @Deprecated
    public CharSequence studentName;
    /** @deprecated */
    @Deprecated
    public CharSequence studentId;
    private static final DatumWriter<SampleReferenceStudent> WRITER$;
    private static final DatumReader<SampleReferenceStudent> READER$;

    public static Schema getClassSchema() {
        return SCHEMA$;
    }

    public static BinaryMessageEncoder<SampleReferenceStudent> getEncoder() {
        return ENCODER;
    }

    public static BinaryMessageDecoder<SampleReferenceStudent> getDecoder() {
        return DECODER;
    }

    public static BinaryMessageDecoder<SampleReferenceStudent> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder(MODEL$, SCHEMA$, resolver);
    }

    public ByteBuffer toByteBuffer() throws IOException {
        return ENCODER.encode(this);
    }

    public static SampleReferenceStudent fromByteBuffer(ByteBuffer b) throws IOException {
        return (SampleReferenceStudent)DECODER.decode(b);
    }

    public SampleReferenceStudent() {
    }

    public SampleReferenceStudent(CharSequence studentName, CharSequence studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public SpecificData getSpecificData() {
        return MODEL$;
    }

    public Schema getSchema() {
        return SCHEMA$;
    }

    public Object get(int field$) {
        switch(field$) {
            case 0:
                return this.studentName;
            case 1:
                return this.studentId;
            default:
                throw new AvroRuntimeException("Bad index");
        }
    }

    public void put(int field$, Object value$) {
        switch(field$) {
            case 0:
                this.studentName = (CharSequence)value$;
                break;
            case 1:
                this.studentId = (CharSequence)value$;
                break;
            default:
                throw new AvroRuntimeException("Bad index");
        }

    }

    public CharSequence getStudentName() {
        return this.studentName;
    }

    public void setStudentName(CharSequence value) {
        this.studentName = value;
    }

    public CharSequence getStudentId() {
        return this.studentId;
    }

    public void setStudentId(CharSequence value) {
        this.studentId = value;
    }

    public static SampleReferenceStudent.Builder newBuilder() {
        return new SampleReferenceStudent.Builder();
    }

    public static SampleReferenceStudent.Builder newBuilder(SampleReferenceStudent.Builder other) {
        return other == null ? new SampleReferenceStudent.Builder() : new SampleReferenceStudent.Builder(other);
    }

    public static SampleReferenceStudent.Builder newBuilder(SampleReferenceStudent other) {
        return other == null ? new SampleReferenceStudent.Builder() : new SampleReferenceStudent.Builder(other);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    public void readExternal(ObjectInput in) throws IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    protected boolean hasCustomCoders() {
        return true;
    }

    public void customEncode(Encoder out) throws IOException {
        out.writeString(this.studentName);
        out.writeString(this.studentId);
    }

    public void customDecode(ResolvingDecoder in) throws IOException {
        Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.studentName = in.readString(this.studentName instanceof Utf8 ? (Utf8)this.studentName : null);
            this.studentId = in.readString(this.studentId instanceof Utf8 ? (Utf8)this.studentId : null);
        } else {
            for(int i = 0; i < 2; ++i) {
                switch(fieldOrder[i].pos()) {
                    case 0:
                        this.studentName = in.readString(this.studentName instanceof Utf8 ? (Utf8)this.studentName : null);
                        break;
                    case 1:
                        this.studentId = in.readString(this.studentId instanceof Utf8 ? (Utf8)this.studentId : null);
                        break;
                    default:
                        throw new IOException("Corrupt ResolvingDecoder.");
                }
            }
        }

    }

    static {
        ENCODER = new BinaryMessageEncoder(MODEL$, SCHEMA$);
        DECODER = new BinaryMessageDecoder(MODEL$, SCHEMA$);
        WRITER$ = MODEL$.createDatumWriter(SCHEMA$);
        READER$ = MODEL$.createDatumReader(SCHEMA$);
    }

    @AvroGenerated
    public static class Builder extends SpecificRecordBuilderBase<SampleReferenceStudent> implements RecordBuilder<SampleReferenceStudent> {
        private CharSequence studentName;
        private CharSequence studentId;

        private Builder() {
            super(SampleReferenceStudent.SCHEMA$);
        }

        private Builder(SampleReferenceStudent.Builder other) {
            super(other);
            if (isValidValue(this.fields()[0], other.studentName)) {
                this.studentName = (CharSequence)this.data().deepCopy(this.fields()[0].schema(), other.studentName);
                this.fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }

            if (isValidValue(this.fields()[1], other.studentId)) {
                this.studentId = (CharSequence)this.data().deepCopy(this.fields()[1].schema(), other.studentId);
                this.fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }

        }

        private Builder(SampleReferenceStudent other) {
            super(SampleReferenceStudent.SCHEMA$);
            if (isValidValue(this.fields()[0], other.studentName)) {
                this.studentName = (CharSequence)this.data().deepCopy(this.fields()[0].schema(), other.studentName);
                this.fieldSetFlags()[0] = true;
            }

            if (isValidValue(this.fields()[1], other.studentId)) {
                this.studentId = (CharSequence)this.data().deepCopy(this.fields()[1].schema(), other.studentId);
                this.fieldSetFlags()[1] = true;
            }

        }

        public CharSequence getStudentName() {
            return this.studentName;
        }

        public SampleReferenceStudent.Builder setStudentName(CharSequence value) {
            this.validate(this.fields()[0], value);
            this.studentName = value;
            this.fieldSetFlags()[0] = true;
            return this;
        }

        public boolean hasStudentName() {
            return this.fieldSetFlags()[0];
        }

        public SampleReferenceStudent.Builder clearStudentName() {
            this.studentName = null;
            this.fieldSetFlags()[0] = false;
            return this;
        }

        public CharSequence getStudentId() {
            return this.studentId;
        }

        public SampleReferenceStudent.Builder setStudentId(CharSequence value) {
            this.validate(this.fields()[1], value);
            this.studentId = value;
            this.fieldSetFlags()[1] = true;
            return this;
        }

        public boolean hasStudentId() {
            return this.fieldSetFlags()[1];
        }

        public SampleReferenceStudent.Builder clearStudentId() {
            this.studentId = null;
            this.fieldSetFlags()[1] = false;
            return this;
        }

        public SampleReferenceStudent build() {
            try {
                SampleReferenceStudent record = new SampleReferenceStudent();
                record.studentName = this.fieldSetFlags()[0] ? this.studentName : (CharSequence)this.defaultValue(this.fields()[0]);
                record.studentId = this.fieldSetFlags()[1] ? this.studentId : (CharSequence)this.defaultValue(this.fields()[1]);
                return record;
            } catch (AvroMissingFieldException var2) {
                throw var2;
            } catch (Exception var3) {
                throw new AvroRuntimeException(var3);
            }
        }
    }
}
