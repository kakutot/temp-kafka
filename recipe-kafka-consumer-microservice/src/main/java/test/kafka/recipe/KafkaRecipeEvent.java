/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package test.kafka.recipe;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import test.kafka.EventType;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class KafkaRecipeEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7050483189070744083L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KafkaRecipeEvent\",\"namespace\":\"kafka\",\"fields\":[{\"name\":\"recipeKafka\",\"type\":{\"type\":\"record\",\"name\":\"RecipeKafka\",\"fields\":[{\"name\":\"recipeId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"recipeName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"time\",\"type\":\"int\"},{\"name\":\"difficulty\",\"type\":\"int\"},{\"name\":\"cuisine\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"calories\",\"type\":\"double\"},{\"name\":\"ingredientList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IngredientKafka\",\"fields\":[{\"name\":\"ingredientId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"recipeId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"productId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"measureUnit\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"calories\",\"type\":\"double\"},{\"name\":\"amount\",\"type\":\"double\"}]},\"java-class\":\"java.util.List\"}}]}},{\"name\":\"eventType\",\"type\":{\"type\":\"enum\",\"name\":\"EventType\",\"symbols\":[\"CREATE\",\"UPDATE\",\"DELETE\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KafkaRecipeEvent> ENCODER =
      new BinaryMessageEncoder<KafkaRecipeEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KafkaRecipeEvent> DECODER =
      new BinaryMessageDecoder<KafkaRecipeEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<KafkaRecipeEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<KafkaRecipeEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KafkaRecipeEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this KafkaRecipeEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a KafkaRecipeEvent from a ByteBuffer. */
  public static KafkaRecipeEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated
  public RecipeKafka recipeKafka;
  @Deprecated
  public EventType eventType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KafkaRecipeEvent() {}

  /**
   * All-args constructor.
   * @param recipeKafka The new value for recipeKafka
   * @param eventType The new value for eventType
   */
  public KafkaRecipeEvent(RecipeKafka recipeKafka, EventType eventType) {
    this.recipeKafka = recipeKafka;
    this.eventType = eventType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return recipeKafka;
    case 1: return eventType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: recipeKafka = (RecipeKafka)value$; break;
    case 1: eventType = (EventType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'recipeKafka' field.
   * @return The value of the 'recipeKafka' field.
   */
  public RecipeKafka getRecipeKafka() {
    return recipeKafka;
  }

  /**
   * Sets the value of the 'recipeKafka' field.
   * @param value the value to set.
   */
  public void setRecipeKafka(RecipeKafka value) {
    this.recipeKafka = value;
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
   * Creates a new KafkaRecipeEvent RecordBuilder.
   * @return A new KafkaRecipeEvent RecordBuilder
   */
  public static KafkaRecipeEvent.Builder newBuilder() {
    return new KafkaRecipeEvent.Builder();
  }

  /**
   * Creates a new KafkaRecipeEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KafkaRecipeEvent RecordBuilder
   */
  public static KafkaRecipeEvent.Builder newBuilder(KafkaRecipeEvent.Builder other) {
    return new KafkaRecipeEvent.Builder(other);
  }

  /**
   * Creates a new KafkaRecipeEvent RecordBuilder by copying an existing KafkaRecipeEvent instance.
   * @param other The existing instance to copy.
   * @return A new KafkaRecipeEvent RecordBuilder
   */
  public static KafkaRecipeEvent.Builder newBuilder(KafkaRecipeEvent other) {
    return new KafkaRecipeEvent.Builder(other);
  }

  /**
   * RecordBuilder for KafkaRecipeEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KafkaRecipeEvent>
    implements org.apache.avro.data.RecordBuilder<KafkaRecipeEvent> {

    private RecipeKafka recipeKafka;
    private RecipeKafka.Builder recipeKafkaBuilder;
    private EventType eventType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(KafkaRecipeEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.recipeKafka)) {
        this.recipeKafka = data().deepCopy(fields()[0].schema(), other.recipeKafka);
        fieldSetFlags()[0] = true;
      }
      if (other.hasRecipeKafkaBuilder()) {
        this.recipeKafkaBuilder = RecipeKafka.newBuilder(other.getRecipeKafkaBuilder());
      }
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing KafkaRecipeEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(KafkaRecipeEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.recipeKafka)) {
        this.recipeKafka = data().deepCopy(fields()[0].schema(), other.recipeKafka);
        fieldSetFlags()[0] = true;
      }
      this.recipeKafkaBuilder = null;
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'recipeKafka' field.
      * @return The value.
      */
    public RecipeKafka getRecipeKafka() {
      return recipeKafka;
    }

    /**
      * Sets the value of the 'recipeKafka' field.
      * @param value The value of 'recipeKafka'.
      * @return This builder.
      */
    public KafkaRecipeEvent.Builder setRecipeKafka(RecipeKafka value) {
      validate(fields()[0], value);
      this.recipeKafkaBuilder = null;
      this.recipeKafka = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'recipeKafka' field has been set.
      * @return True if the 'recipeKafka' field has been set, false otherwise.
      */
    public boolean hasRecipeKafka() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'recipeKafka' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public RecipeKafka.Builder getRecipeKafkaBuilder() {
      if (recipeKafkaBuilder == null) {
        if (hasRecipeKafka()) {
          setRecipeKafkaBuilder(RecipeKafka.newBuilder(recipeKafka));
        } else {
          setRecipeKafkaBuilder(RecipeKafka.newBuilder());
        }
      }
      return recipeKafkaBuilder;
    }

    /**
     * Sets the Builder instance for the 'recipeKafka' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public KafkaRecipeEvent.Builder setRecipeKafkaBuilder(RecipeKafka.Builder value) {
      clearRecipeKafka();
      recipeKafkaBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'recipeKafka' field has an active Builder instance
     * @return True if the 'recipeKafka' field has an active Builder instance
     */
    public boolean hasRecipeKafkaBuilder() {
      return recipeKafkaBuilder != null;
    }

    /**
      * Clears the value of the 'recipeKafka' field.
      * @return This builder.
      */
    public KafkaRecipeEvent.Builder clearRecipeKafka() {
      recipeKafka = null;
      recipeKafkaBuilder = null;
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
    public KafkaRecipeEvent.Builder setEventType(EventType value) {
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
    public KafkaRecipeEvent.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KafkaRecipeEvent build() {
      try {
        KafkaRecipeEvent record = new KafkaRecipeEvent();
        if (recipeKafkaBuilder != null) {
          record.recipeKafka = this.recipeKafkaBuilder.build();
        } else {
          record.recipeKafka = fieldSetFlags()[0] ? this.recipeKafka : (RecipeKafka) defaultValue(fields()[0]);
        }
        record.eventType = fieldSetFlags()[1] ? this.eventType : (EventType) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KafkaRecipeEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<KafkaRecipeEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KafkaRecipeEvent>
    READER$ = (org.apache.avro.io.DatumReader<KafkaRecipeEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override
  public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
