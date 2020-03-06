package com.lareccete.product.kafka; /**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class KafkaProductEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1786944621249268276L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"com.lareccete.product.kafka.KafkaProductEvent\",\"namespace\":\"com.larecette.product.command.temp\",\"fields\":[{\"name\":\"productKafka\",\"type\":{\"type\":\"record\",\"name\":\"com.lareccete.product.kafka.ProductKafka\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"proteins\",\"type\":\"double\"},{\"name\":\"carbohydrates\",\"type\":\"double\"},{\"name\":\"fats\",\"type\":\"double\"},{\"name\":\"calories\",\"type\":\"double\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"measureUnit\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"eventType\",\"type\":{\"type\":\"enum\",\"name\":\"com.lareccete.product.kafka.EventType\",\"symbols\":[\"CREATE\",\"UPDATE\",\"DELETE\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KafkaProductEvent> ENCODER =
      new BinaryMessageEncoder<KafkaProductEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KafkaProductEvent> DECODER =
      new BinaryMessageDecoder<KafkaProductEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<KafkaProductEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<KafkaProductEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KafkaProductEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this com.lareccete.product.kafka.KafkaProductEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a com.lareccete.product.kafka.KafkaProductEvent from a ByteBuffer. */
  public static KafkaProductEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated
  public ProductKafka productKafka;
  @Deprecated
  public EventType eventType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KafkaProductEvent() {}

  /**
   * All-args constructor.
   * @param productKafka The new value for productKafka
   * @param eventType The new value for eventType
   */
  public KafkaProductEvent(ProductKafka productKafka,
                           EventType eventType) {
    this.productKafka = productKafka;
    this.eventType = eventType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return productKafka;
    case 1: return eventType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: productKafka = (ProductKafka)value$; break;
    case 1: eventType = (EventType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'productKafka' field.
   * @return The value of the 'productKafka' field.
   */
  public ProductKafka getProductKafka() {
    return productKafka;
  }

  /**
   * Sets the value of the 'productKafka' field.
   * @param value the value to set.
   */
  public void setProductKafka(ProductKafka value) {
    this.productKafka = value;
  }

  /**
   * Gets the value of the 'eventType' field.
   * @return The value of the 'eventType' field.
   */
  public EventType getEventType() {
    return eventType;
  }

  /**
   * Sets the value of the 'eventType' field.
   * @param value the value to set.
   */
  public void setEventType(EventType value) {
    this.eventType = value;
  }

  /**
   * Creates a new com.lareccete.product.kafka.KafkaProductEvent RecordBuilder.
   * @return A new com.lareccete.product.kafka.KafkaProductEvent RecordBuilder
   */
  public static KafkaProductEvent.Builder newBuilder() {
    return new KafkaProductEvent.Builder();
  }

  /**
   * Creates a new com.lareccete.product.kafka.KafkaProductEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new com.lareccete.product.kafka.KafkaProductEvent RecordBuilder
   */
  public static KafkaProductEvent.Builder newBuilder(KafkaProductEvent.Builder other) {
    return new KafkaProductEvent.Builder(other);
  }

  /**
   * Creates a new com.lareccete.product.kafka.KafkaProductEvent RecordBuilder by copying an existing com.lareccete.product.kafka.KafkaProductEvent instance.
   * @param other The existing instance to copy.
   * @return A new com.lareccete.product.kafka.KafkaProductEvent RecordBuilder
   */
  public static KafkaProductEvent.Builder newBuilder(KafkaProductEvent other) {
    return new KafkaProductEvent.Builder(other);
  }

  /**
   * RecordBuilder for com.lareccete.product.kafka.KafkaProductEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KafkaProductEvent>
    implements org.apache.avro.data.RecordBuilder<KafkaProductEvent> {

    private ProductKafka productKafka;
    private ProductKafka.Builder productKafkaBuilder;
    private EventType eventType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(KafkaProductEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.productKafka)) {
        this.productKafka = data().deepCopy(fields()[0].schema(), other.productKafka);
        fieldSetFlags()[0] = true;
      }
      if (other.hasProductKafkaBuilder()) {
        this.productKafkaBuilder = ProductKafka.newBuilder(other.getProductKafkaBuilder());
      }
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing com.lareccete.product.kafka.KafkaProductEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(KafkaProductEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.productKafka)) {
        this.productKafka = data().deepCopy(fields()[0].schema(), other.productKafka);
        fieldSetFlags()[0] = true;
      }
      this.productKafkaBuilder = null;
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'productKafka' field.
      * @return The value.
      */
    public ProductKafka getProductKafka() {
      return productKafka;
    }

    /**
      * Sets the value of the 'productKafka' field.
      * @param value The value of 'productKafka'.
      * @return This builder.
      */
    public KafkaProductEvent.Builder setProductKafka(ProductKafka value) {
      validate(fields()[0], value);
      this.productKafkaBuilder = null;
      this.productKafka = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'productKafka' field has been set.
      * @return True if the 'productKafka' field has been set, false otherwise.
      */
    public boolean hasProductKafka() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'productKafka' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public ProductKafka.Builder getProductKafkaBuilder() {
      if (productKafkaBuilder == null) {
        if (hasProductKafka()) {
          setProductKafkaBuilder(ProductKafka.newBuilder(productKafka));
        } else {
          setProductKafkaBuilder(ProductKafka.newBuilder());
        }
      }
      return productKafkaBuilder;
    }

    /**
     * Sets the Builder instance for the 'productKafka' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public KafkaProductEvent.Builder setProductKafkaBuilder(ProductKafka.Builder value) {
      clearProductKafka();
      productKafkaBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'productKafka' field has an active Builder instance
     * @return True if the 'productKafka' field has an active Builder instance
     */
    public boolean hasProductKafkaBuilder() {
      return productKafkaBuilder != null;
    }

    /**
      * Clears the value of the 'productKafka' field.
      * @return This builder.
      */
    public KafkaProductEvent.Builder clearProductKafka() {
      productKafka = null;
      productKafkaBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventType' field.
      * @return The value.
      */
    public EventType getEventType() {
      return eventType;
    }

    /**
      * Sets the value of the 'eventType' field.
      * @param value The value of 'eventType'.
      * @return This builder.
      */
    public KafkaProductEvent.Builder setEventType(EventType value) {
      validate(fields()[1], value);
      this.eventType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'eventType' field has been set.
      * @return True if the 'eventType' field has been set, false otherwise.
      */
    public boolean hasEventType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'eventType' field.
      * @return This builder.
      */
    public KafkaProductEvent.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KafkaProductEvent build() {
      try {
        KafkaProductEvent record = new KafkaProductEvent();
        if (productKafkaBuilder != null) {
          record.productKafka = this.productKafkaBuilder.build();
        } else {
          record.productKafka = fieldSetFlags()[0] ? this.productKafka : (ProductKafka) defaultValue(fields()[0]);
        }
        record.eventType = fieldSetFlags()[1] ? this.eventType : (EventType) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KafkaProductEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<KafkaProductEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KafkaProductEvent>
    READER$ = (org.apache.avro.io.DatumReader<KafkaProductEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override
  public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
