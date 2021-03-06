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

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class IngredientKafka extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5564948959019780683L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IngredientKafka\",\"namespace\":\"kafka\",\"fields\":[{\"name\":\"ingredientId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"recipeId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"productId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"measureUnit\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"calories\",\"type\":\"double\"},{\"name\":\"amount\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<IngredientKafka> ENCODER =
      new BinaryMessageEncoder<IngredientKafka>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<IngredientKafka> DECODER =
      new BinaryMessageDecoder<IngredientKafka>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<IngredientKafka> getDecoder() {
    return DECODER;
  }
  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<IngredientKafka> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<IngredientKafka>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this IngredientKafka to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a IngredientKafka from a ByteBuffer. */
  public static IngredientKafka fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated
  public java.lang.String ingredientId;
  @Deprecated
  public java.lang.String recipeId;
  @Deprecated
  public java.lang.String productId;
  @Deprecated
  public java.lang.String name;
  @Deprecated
  public java.lang.String measureUnit;
  @Deprecated
  public double calories;
  @Deprecated
  public double amount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IngredientKafka() {}

  /**
   * All-args constructor.
   * @param ingredientId The new value for ingredientId
   * @param recipeId The new value for recipeId
   * @param productId The new value for productId
   * @param name The new value for name
   * @param measureUnit The new value for measureUnit
   * @param calories The new value for calories
   * @param amount The new value for amount
   */
  public IngredientKafka(java.lang.String ingredientId, java.lang.String recipeId, java.lang.String productId, java.lang.String name, java.lang.String measureUnit, java.lang.Double calories, java.lang.Double amount) {
    this.ingredientId = ingredientId;
    this.recipeId = recipeId;
    this.productId = productId;
    this.name = name;
    this.measureUnit = measureUnit;
    this.calories = calories;
    this.amount = amount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ingredientId;
    case 1: return recipeId;
    case 2: return productId;
    case 3: return name;
    case 4: return measureUnit;
    case 5: return calories;
    case 6: return amount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ingredientId = (java.lang.String)value$; break;
    case 1: recipeId = (java.lang.String)value$; break;
    case 2: productId = (java.lang.String)value$; break;
    case 3: name = (java.lang.String)value$; break;
    case 4: measureUnit = (java.lang.String)value$; break;
    case 5: calories = (java.lang.Double)value$; break;
    case 6: amount = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ingredientId' field.
   * @return The value of the 'ingredientId' field.
   */
  public java.lang.String getIngredientId() {
    return ingredientId;
  }

  /**
   * Sets the value of the 'ingredientId' field.
   * @param value the value to set.
   */
  public void setIngredientId(java.lang.String value) {
    this.ingredientId = value;
  }

  /**
   * Gets the value of the 'recipeId' field.
   * @return The value of the 'recipeId' field.
   */
  public java.lang.String getRecipeId() {
    return recipeId;
  }

  /**
   * Sets the value of the 'recipeId' field.
   * @param value the value to set.
   */
  public void setRecipeId(java.lang.String value) {
    this.recipeId = value;
  }

  /**
   * Gets the value of the 'productId' field.
   * @return The value of the 'productId' field.
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * Sets the value of the 'productId' field.
   * @param value the value to set.
   */
  public void setProductId(java.lang.String value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'measureUnit' field.
   * @return The value of the 'measureUnit' field.
   */
  public java.lang.String getMeasureUnit() {
    return measureUnit;
  }

  /**
   * Sets the value of the 'measureUnit' field.
   * @param value the value to set.
   */
  public void setMeasureUnit(java.lang.String value) {
    this.measureUnit = value;
  }

  /**
   * Gets the value of the 'calories' field.
   * @return The value of the 'calories' field.
   */
  public java.lang.Double getCalories() {
    return calories;
  }

  /**
   * Sets the value of the 'calories' field.
   * @param value the value to set.
   */
  public void setCalories(java.lang.Double value) {
    this.calories = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.lang.Double getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.Double value) {
    this.amount = value;
  }

  /**
   * Creates a new IngredientKafka RecordBuilder.
   * @return A new IngredientKafka RecordBuilder
   */
  public static IngredientKafka.Builder newBuilder() {
    return new IngredientKafka.Builder();
  }

  /**
   * Creates a new IngredientKafka RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IngredientKafka RecordBuilder
   */
  public static IngredientKafka.Builder newBuilder(IngredientKafka.Builder other) {
    return new IngredientKafka.Builder(other);
  }

  /**
   * Creates a new IngredientKafka RecordBuilder by copying an existing IngredientKafka instance.
   * @param other The existing instance to copy.
   * @return A new IngredientKafka RecordBuilder
   */
  public static IngredientKafka.Builder newBuilder(IngredientKafka other) {
    return new IngredientKafka.Builder(other);
  }

  /**
   * RecordBuilder for IngredientKafka instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IngredientKafka>
    implements org.apache.avro.data.RecordBuilder<IngredientKafka> {

    private java.lang.String ingredientId;
    private java.lang.String recipeId;
    private java.lang.String productId;
    private java.lang.String name;
    private java.lang.String measureUnit;
    private double calories;
    private double amount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(IngredientKafka.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ingredientId)) {
        this.ingredientId = data().deepCopy(fields()[0].schema(), other.ingredientId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recipeId)) {
        this.recipeId = data().deepCopy(fields()[1].schema(), other.recipeId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.productId)) {
        this.productId = data().deepCopy(fields()[2].schema(), other.productId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.measureUnit)) {
        this.measureUnit = data().deepCopy(fields()[4].schema(), other.measureUnit);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.calories)) {
        this.calories = data().deepCopy(fields()[5].schema(), other.calories);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.amount)) {
        this.amount = data().deepCopy(fields()[6].schema(), other.amount);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing IngredientKafka instance
     * @param other The existing instance to copy.
     */
    private Builder(IngredientKafka other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.ingredientId)) {
        this.ingredientId = data().deepCopy(fields()[0].schema(), other.ingredientId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recipeId)) {
        this.recipeId = data().deepCopy(fields()[1].schema(), other.recipeId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.productId)) {
        this.productId = data().deepCopy(fields()[2].schema(), other.productId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.measureUnit)) {
        this.measureUnit = data().deepCopy(fields()[4].schema(), other.measureUnit);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.calories)) {
        this.calories = data().deepCopy(fields()[5].schema(), other.calories);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.amount)) {
        this.amount = data().deepCopy(fields()[6].schema(), other.amount);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'ingredientId' field.
      * @return The value.
      */
    public java.lang.String getIngredientId() {
      return ingredientId;
    }

    /**
      * Sets the value of the 'ingredientId' field.
      * @param value The value of 'ingredientId'.
      * @return This builder.
      */
    public IngredientKafka.Builder setIngredientId(java.lang.String value) {
      validate(fields()[0], value);
      this.ingredientId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ingredientId' field has been set.
      * @return True if the 'ingredientId' field has been set, false otherwise.
      */
    public boolean hasIngredientId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ingredientId' field.
      * @return This builder.
      */
    public IngredientKafka.Builder clearIngredientId() {
      ingredientId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'recipeId' field.
      * @return The value.
      */
    public java.lang.String getRecipeId() {
      return recipeId;
    }

    /**
      * Sets the value of the 'recipeId' field.
      * @param value The value of 'recipeId'.
      * @return This builder.
      */
    public IngredientKafka.Builder setRecipeId(java.lang.String value) {
      validate(fields()[1], value);
      this.recipeId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'recipeId' field has been set.
      * @return True if the 'recipeId' field has been set, false otherwise.
      */
    public boolean hasRecipeId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'recipeId' field.
      * @return This builder.
      */
    public IngredientKafka.Builder clearRecipeId() {
      recipeId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'productId' field.
      * @return The value.
      */
    public java.lang.String getProductId() {
      return productId;
    }

    /**
      * Sets the value of the 'productId' field.
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public IngredientKafka.Builder setProductId(java.lang.String value) {
      validate(fields()[2], value);
      this.productId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'productId' field.
      * @return This builder.
      */
    public IngredientKafka.Builder clearProductId() {
      productId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public IngredientKafka.Builder setName(java.lang.String value) {
      validate(fields()[3], value);
      this.name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public IngredientKafka.Builder clearName() {
      name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'measureUnit' field.
      * @return The value.
      */
    public java.lang.String getMeasureUnit() {
      return measureUnit;
    }

    /**
      * Sets the value of the 'measureUnit' field.
      * @param value The value of 'measureUnit'.
      * @return This builder.
      */
    public IngredientKafka.Builder setMeasureUnit(java.lang.String value) {
      validate(fields()[4], value);
      this.measureUnit = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'measureUnit' field has been set.
      * @return True if the 'measureUnit' field has been set, false otherwise.
      */
    public boolean hasMeasureUnit() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'measureUnit' field.
      * @return This builder.
      */
    public IngredientKafka.Builder clearMeasureUnit() {
      measureUnit = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'calories' field.
      * @return The value.
      */
    public java.lang.Double getCalories() {
      return calories;
    }

    /**
      * Sets the value of the 'calories' field.
      * @param value The value of 'calories'.
      * @return This builder.
      */
    public IngredientKafka.Builder setCalories(double value) {
      validate(fields()[5], value);
      this.calories = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'calories' field has been set.
      * @return True if the 'calories' field has been set, false otherwise.
      */
    public boolean hasCalories() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'calories' field.
      * @return This builder.
      */
    public IngredientKafka.Builder clearCalories() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.lang.Double getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public IngredientKafka.Builder setAmount(double value) {
      validate(fields()[6], value);
      this.amount = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public IngredientKafka.Builder clearAmount() {
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public IngredientKafka build() {
      try {
        IngredientKafka record = new IngredientKafka();
        record.ingredientId = fieldSetFlags()[0] ? this.ingredientId : (java.lang.String) defaultValue(fields()[0]);
        record.recipeId = fieldSetFlags()[1] ? this.recipeId : (java.lang.String) defaultValue(fields()[1]);
        record.productId = fieldSetFlags()[2] ? this.productId : (java.lang.String) defaultValue(fields()[2]);
        record.name = fieldSetFlags()[3] ? this.name : (java.lang.String) defaultValue(fields()[3]);
        record.measureUnit = fieldSetFlags()[4] ? this.measureUnit : (java.lang.String) defaultValue(fields()[4]);
        record.calories = fieldSetFlags()[5] ? this.calories : (java.lang.Double) defaultValue(fields()[5]);
        record.amount = fieldSetFlags()[6] ? this.amount : (java.lang.Double) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<IngredientKafka>
    WRITER$ = (org.apache.avro.io.DatumWriter<IngredientKafka>)MODEL$.createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<IngredientKafka>
    READER$ = (org.apache.avro.io.DatumReader<IngredientKafka>)MODEL$.createDatumReader(SCHEMA$);

  @Override
  public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
