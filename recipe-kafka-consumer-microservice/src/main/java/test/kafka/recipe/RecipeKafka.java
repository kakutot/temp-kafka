/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package test.kafka.recipe;

import test.model.spanner.Ingredient;
import test.model.elastic.Recipe;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

import java.util.UUID;
import java.util.stream.Collectors;


@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RecipeKafka extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1422965707293342730L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecipeKafka\",\"namespace\":\"kafka\",\"fields\":[{\"name\":\"recipeId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"recipeName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"time\",\"type\":\"int\"},{\"name\":\"difficulty\",\"type\":\"int\"},{\"name\":\"cuisine\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"calories\",\"type\":\"double\"},{\"name\":\"ingredientList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IngredientKafka\",\"fields\":[{\"name\":\"ingredientId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"recipeId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"productId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"measureUnit\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"calories\",\"type\":\"double\"},{\"name\":\"amount\",\"type\":\"double\"}]},\"java-class\":\"java.util.List\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RecipeKafka> ENCODER =
      new BinaryMessageEncoder<RecipeKafka>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RecipeKafka> DECODER =
      new BinaryMessageDecoder<RecipeKafka>(MODEL$, SCHEMA$);

  public static Recipe toElastic(RecipeKafka recipeKafka) {
    Recipe recipe = new Recipe();
    recipe.setRecipeId(UUID.fromString(recipeKafka.getRecipeId()));
    recipe.setCalories(recipeKafka.getCalories());
    recipe.setCuisine(recipeKafka.getCuisine());
    recipe.setRecipeName(recipeKafka.getRecipeName());
    recipe.setDifficulty(recipeKafka.getDifficulty());
    recipe.setTime(recipe.getTime());
    recipe.setDescription(recipeKafka.getDescription());

    recipe.setIngredients(recipeKafka.getIngredientList().stream().map(ingredientKafka -> {
      Ingredient ingredient = new Ingredient();
      ingredient.setIngredientId(UUID.fromString(ingredientKafka.getIngredientId()));
      ingredient.setRecipeId(ingredientKafka.getRecipeId());
      ingredient.setProductId(ingredientKafka.getProductId());
      ingredient.setAmount(ingredientKafka.getAmount());
      ingredient.setMeasureUnit(ingredientKafka.getMeasureUnit());
      ingredient.setCalories(ingredientKafka.getCalories());
      ingredient.setName(ingredientKafka.getName());

      return ingredient;
    }).collect(Collectors.toList()));

    return recipe;
  }
  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<RecipeKafka> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<RecipeKafka> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RecipeKafka>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this RecipeKafka to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a RecipeKafka from a ByteBuffer. */
  public static RecipeKafka fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated
  public java.lang.String recipeId;
  @Deprecated
  public java.lang.String recipeName;
  @Deprecated
  public java.lang.String description;
  @Deprecated
  public int time;
  @Deprecated
  public int difficulty;
  @Deprecated
  public java.lang.String cuisine;
  @Deprecated
  public double calories;
  @Deprecated
  public java.util.List<IngredientKafka> ingredientList;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RecipeKafka() {}

  /**
   * All-args constructor.
   * @param recipeId The new value for recipeId
   * @param recipeName The new value for recipeName
   * @param description The new value for description
   * @param time The new value for time
   * @param difficulty The new value for difficulty
   * @param cuisine The new value for cuisine
   * @param calories The new value for calories
   * @param ingredientList The new value for ingredientList
   */
  public RecipeKafka(java.lang.String recipeId, java.lang.String recipeName, java.lang.String description, java.lang.Integer time, java.lang.Integer difficulty, java.lang.String cuisine, java.lang.Double calories, java.util.List<IngredientKafka> ingredientList) {
    this.recipeId = recipeId;
    this.recipeName = recipeName;
    this.description = description;
    this.time = time;
    this.difficulty = difficulty;
    this.cuisine = cuisine;
    this.calories = calories;
    this.ingredientList = ingredientList;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return recipeId;
    case 1: return recipeName;
    case 2: return description;
    case 3: return time;
    case 4: return difficulty;
    case 5: return cuisine;
    case 6: return calories;
    case 7: return ingredientList;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: recipeId = (java.lang.String)value$; break;
    case 1: recipeName = (java.lang.String)value$; break;
    case 2: description = (java.lang.String)value$; break;
    case 3: time = (java.lang.Integer)value$; break;
    case 4: difficulty = (java.lang.Integer)value$; break;
    case 5: cuisine = (java.lang.String)value$; break;
    case 6: calories = (java.lang.Double)value$; break;
    case 7: ingredientList = (java.util.List<IngredientKafka>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'recipeName' field.
   * @return The value of the 'recipeName' field.
   */
  public java.lang.String getRecipeName() {
    return recipeName;
  }

  /**
   * Sets the value of the 'recipeName' field.
   * @param value the value to set.
   */
  public void setRecipeName(java.lang.String value) {
    this.recipeName = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return The value of the 'time' field.
   */
  public java.lang.Integer getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * @param value the value to set.
   */
  public void setTime(java.lang.Integer value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'difficulty' field.
   * @return The value of the 'difficulty' field.
   */
  public java.lang.Integer getDifficulty() {
    return difficulty;
  }

  /**
   * Sets the value of the 'difficulty' field.
   * @param value the value to set.
   */
  public void setDifficulty(java.lang.Integer value) {
    this.difficulty = value;
  }

  /**
   * Gets the value of the 'cuisine' field.
   * @return The value of the 'cuisine' field.
   */
  public java.lang.String getCuisine() {
    return cuisine;
  }

  /**
   * Sets the value of the 'cuisine' field.
   * @param value the value to set.
   */
  public void setCuisine(java.lang.String value) {
    this.cuisine = value;
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
   * Gets the value of the 'ingredientList' field.
   * @return The value of the 'ingredientList' field.
   */
  public java.util.List<IngredientKafka> getIngredientList() {
    return ingredientList;
  }

  /**
   * Sets the value of the 'ingredientList' field.
   * @param value the value to set.
   */
  public void setIngredientList(java.util.List<IngredientKafka> value) {
    this.ingredientList = value;
  }

  /**
   * Creates a new RecipeKafka RecordBuilder.
   * @return A new RecipeKafka RecordBuilder
   */
  public static RecipeKafka.Builder newBuilder() {
    return new RecipeKafka.Builder();
  }

  /**
   * Creates a new RecipeKafka RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RecipeKafka RecordBuilder
   */
  public static RecipeKafka.Builder newBuilder(RecipeKafka.Builder other) {
    return new RecipeKafka.Builder(other);
  }

  /**
   * Creates a new RecipeKafka RecordBuilder by copying an existing RecipeKafka instance.
   * @param other The existing instance to copy.
   * @return A new RecipeKafka RecordBuilder
   */
  public static RecipeKafka.Builder newBuilder(RecipeKafka other) {
    return new RecipeKafka.Builder(other);
  }

  /**
   * RecordBuilder for RecipeKafka instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecipeKafka>
    implements org.apache.avro.data.RecordBuilder<RecipeKafka> {

    private java.lang.String recipeId;
    private java.lang.String recipeName;
    private java.lang.String description;
    private int time;
    private int difficulty;
    private java.lang.String cuisine;
    private double calories;
    private java.util.List<IngredientKafka> ingredientList;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(RecipeKafka.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.recipeId)) {
        this.recipeId = data().deepCopy(fields()[0].schema(), other.recipeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recipeName)) {
        this.recipeName = data().deepCopy(fields()[1].schema(), other.recipeName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.time)) {
        this.time = data().deepCopy(fields()[3].schema(), other.time);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.difficulty)) {
        this.difficulty = data().deepCopy(fields()[4].schema(), other.difficulty);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cuisine)) {
        this.cuisine = data().deepCopy(fields()[5].schema(), other.cuisine);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.calories)) {
        this.calories = data().deepCopy(fields()[6].schema(), other.calories);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.ingredientList)) {
        this.ingredientList = data().deepCopy(fields()[7].schema(), other.ingredientList);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RecipeKafka instance
     * @param other The existing instance to copy.
     */
    private Builder(RecipeKafka other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.recipeId)) {
        this.recipeId = data().deepCopy(fields()[0].schema(), other.recipeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recipeName)) {
        this.recipeName = data().deepCopy(fields()[1].schema(), other.recipeName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.time)) {
        this.time = data().deepCopy(fields()[3].schema(), other.time);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.difficulty)) {
        this.difficulty = data().deepCopy(fields()[4].schema(), other.difficulty);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cuisine)) {
        this.cuisine = data().deepCopy(fields()[5].schema(), other.cuisine);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.calories)) {
        this.calories = data().deepCopy(fields()[6].schema(), other.calories);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.ingredientList)) {
        this.ingredientList = data().deepCopy(fields()[7].schema(), other.ingredientList);
        fieldSetFlags()[7] = true;
      }
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
    public RecipeKafka.Builder setRecipeId(java.lang.String value) {
      validate(fields()[0], value);
      this.recipeId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'recipeId' field has been set.
      * @return True if the 'recipeId' field has been set, false otherwise.
      */
    public boolean hasRecipeId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'recipeId' field.
      * @return This builder.
      */
    public RecipeKafka.Builder clearRecipeId() {
      recipeId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'recipeName' field.
      * @return The value.
      */
    public java.lang.String getRecipeName() {
      return recipeName;
    }

    /**
      * Sets the value of the 'recipeName' field.
      * @param value The value of 'recipeName'.
      * @return This builder.
      */
    public RecipeKafka.Builder setRecipeName(java.lang.String value) {
      validate(fields()[1], value);
      this.recipeName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'recipeName' field has been set.
      * @return True if the 'recipeName' field has been set, false otherwise.
      */
    public boolean hasRecipeName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'recipeName' field.
      * @return This builder.
      */
    public RecipeKafka.Builder clearRecipeName() {
      recipeName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.String getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public RecipeKafka.Builder setDescription(java.lang.String value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public RecipeKafka.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * @return The value.
      */
    public java.lang.Integer getTime() {
      return time;
    }

    /**
      * Sets the value of the 'time' field.
      * @param value The value of 'time'.
      * @return This builder.
      */
    public RecipeKafka.Builder setTime(int value) {
      validate(fields()[3], value);
      this.time = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'time' field.
      * @return This builder.
      */
    public RecipeKafka.Builder clearTime() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'difficulty' field.
      * @return The value.
      */
    public java.lang.Integer getDifficulty() {
      return difficulty;
    }

    /**
      * Sets the value of the 'difficulty' field.
      * @param value The value of 'difficulty'.
      * @return This builder.
      */
    public RecipeKafka.Builder setDifficulty(int value) {
      validate(fields()[4], value);
      this.difficulty = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'difficulty' field has been set.
      * @return True if the 'difficulty' field has been set, false otherwise.
      */
    public boolean hasDifficulty() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'difficulty' field.
      * @return This builder.
      */
    public RecipeKafka.Builder clearDifficulty() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'cuisine' field.
      * @return The value.
      */
    public java.lang.String getCuisine() {
      return cuisine;
    }

    /**
      * Sets the value of the 'cuisine' field.
      * @param value The value of 'cuisine'.
      * @return This builder.
      */
    public RecipeKafka.Builder setCuisine(java.lang.String value) {
      validate(fields()[5], value);
      this.cuisine = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'cuisine' field has been set.
      * @return True if the 'cuisine' field has been set, false otherwise.
      */
    public boolean hasCuisine() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'cuisine' field.
      * @return This builder.
      */
    public RecipeKafka.Builder clearCuisine() {
      cuisine = null;
      fieldSetFlags()[5] = false;
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
    public RecipeKafka.Builder setCalories(double value) {
      validate(fields()[6], value);
      this.calories = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'calories' field has been set.
      * @return True if the 'calories' field has been set, false otherwise.
      */
    public boolean hasCalories() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'calories' field.
      * @return This builder.
      */
    public RecipeKafka.Builder clearCalories() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'ingredientList' field.
      * @return The value.
      */
    public java.util.List<IngredientKafka> getIngredientList() {
      return ingredientList;
    }

    /**
      * Sets the value of the 'ingredientList' field.
      * @param value The value of 'ingredientList'.
      * @return This builder.
      */
    public RecipeKafka.Builder setIngredientList(java.util.List<IngredientKafka> value) {
      validate(fields()[7], value);
      this.ingredientList = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'ingredientList' field has been set.
      * @return True if the 'ingredientList' field has been set, false otherwise.
      */
    public boolean hasIngredientList() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'ingredientList' field.
      * @return This builder.
      */
    public RecipeKafka.Builder clearIngredientList() {
      ingredientList = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RecipeKafka build() {
      try {
        RecipeKafka record = new RecipeKafka();
        record.recipeId = fieldSetFlags()[0] ? this.recipeId : (java.lang.String) defaultValue(fields()[0]);
        record.recipeName = fieldSetFlags()[1] ? this.recipeName : (java.lang.String) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.String) defaultValue(fields()[2]);
        record.time = fieldSetFlags()[3] ? this.time : (java.lang.Integer) defaultValue(fields()[3]);
        record.difficulty = fieldSetFlags()[4] ? this.difficulty : (java.lang.Integer) defaultValue(fields()[4]);
        record.cuisine = fieldSetFlags()[5] ? this.cuisine : (java.lang.String) defaultValue(fields()[5]);
        record.calories = fieldSetFlags()[6] ? this.calories : (java.lang.Double) defaultValue(fields()[6]);
        record.ingredientList = fieldSetFlags()[7] ? this.ingredientList : (java.util.List<IngredientKafka>) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RecipeKafka>
    WRITER$ = (org.apache.avro.io.DatumWriter<RecipeKafka>)MODEL$.createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RecipeKafka>
    READER$ = (org.apache.avro.io.DatumReader<RecipeKafka>)MODEL$.createDatumReader(SCHEMA$);

  @Override
  public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}