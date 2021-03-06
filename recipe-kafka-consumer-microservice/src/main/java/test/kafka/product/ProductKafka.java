package test.kafka.product; /**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */

import test.model.spanner.Ingredient;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ProductKafka extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = 4883965466294084224L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"com.lareccete.product.kafka.ProductKafka\",\"namespace\":\"com.larecette.product.command.temp\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"proteins\",\"type\":\"double\"},{\"name\":\"carbohydrates\",\"type\":\"double\"},{\"name\":\"fats\",\"type\":\"double\"},{\"name\":\"calories\",\"type\":\"double\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"measureUnit\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<ProductKafka> ENCODER =
            new BinaryMessageEncoder<ProductKafka>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<ProductKafka> DECODER =
            new BinaryMessageDecoder<ProductKafka>(MODEL$, SCHEMA$);

    //TODO REFACTOR
    public static Ingredient toIngredientSpanner(ProductKafka productKafka) {
        Ingredient ingredient = new Ingredient();
        ingredient.setMeasureUnit(productKafka.getMeasureUnit());
        ingredient.setCalories(productKafka.getCalories());
        ingredient.setName(productKafka.getName());
        ingredient.setProductId(productKafka.getId());
        ingredient.setRecipeId("0");
        ingredient.setAmount(0.0);

        return ingredient;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     */
    public static BinaryMessageDecoder<ProductKafka> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     */
    public static BinaryMessageDecoder<ProductKafka> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<ProductKafka>(MODEL$, SCHEMA$, resolver);
    }

    /** Serializes this com.lareccete.product.kafka.ProductKafka to a ByteBuffer. */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /** Deserializes a com.lareccete.product.kafka.ProductKafka from a ByteBuffer. */
    public static ProductKafka fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated
    public String id;
    @Deprecated
    public double proteins;
    @Deprecated
    public double carbohydrates;
    @Deprecated
    public double fats;
    @Deprecated
    public double calories;
    @Deprecated
    public String name;
    @Deprecated
    public String measureUnit;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public ProductKafka() {
    }

    /**
     * All-args constructor.
     * @param id The new value for id
     * @param proteins The new value for proteins
     * @param carbohydrates The new value for carbohydrates
     * @param fats The new value for fats
     * @param calories The new value for calories
     * @param name The new value for name
     * @param measureUnit The new value for measureUnit
     */
    public ProductKafka(String id, Double proteins, Double carbohydrates, Double fats, Double calories, String name, String measureUnit) {
        this.id = id;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.calories = calories;
        this.name = name;
        this.measureUnit = measureUnit;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public Object get(int field$) {
        switch (field$) {
            case 0:
                return id;
            case 1:
                return proteins;
            case 2:
                return carbohydrates;
            case 3:
                return fats;
            case 4:
                return calories;
            case 5:
                return name;
            case 6:
                return measureUnit;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, Object value$) {
        switch (field$) {
            case 0:
                id = (String) value$;
                break;
            case 1:
                proteins = (Double) value$;
                break;
            case 2:
                carbohydrates = (Double) value$;
                break;
            case 3:
                fats = (Double) value$;
                break;
            case 4:
                calories = (Double) value$;
                break;
            case 5:
                name = (String) value$;
                break;
            case 6:
                measureUnit = (String) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'id' field.
     * @return The value of the 'id' field.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the 'id' field.
     * @param value the value to set.
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'proteins' field.
     * @return The value of the 'proteins' field.
     */
    public Double getProteins() {
        return proteins;
    }

    /**
     * Sets the value of the 'proteins' field.
     * @param value the value to set.
     */
    public void setProteins(Double value) {
        this.proteins = value;
    }

    /**
     * Gets the value of the 'carbohydrates' field.
     * @return The value of the 'carbohydrates' field.
     */
    public Double getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * Sets the value of the 'carbohydrates' field.
     * @param value the value to set.
     */
    public void setCarbohydrates(Double value) {
        this.carbohydrates = value;
    }

    /**
     * Gets the value of the 'fats' field.
     * @return The value of the 'fats' field.
     */
    public Double getFats() {
        return fats;
    }

    /**
     * Sets the value of the 'fats' field.
     * @param value the value to set.
     */
    public void setFats(Double value) {
        this.fats = value;
    }

    /**
     * Gets the value of the 'calories' field.
     * @return The value of the 'calories' field.
     */
    public Double getCalories() {
        return calories;
    }

    /**
     * Sets the value of the 'calories' field.
     * @param value the value to set.
     */
    public void setCalories(Double value) {
        this.calories = value;
    }

    /**
     * Gets the value of the 'name' field.
     * @return The value of the 'name' field.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the 'name' field.
     * @param value the value to set.
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the 'measureUnit' field.
     * @return The value of the 'measureUnit' field.
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Sets the value of the 'measureUnit' field.
     * @param value the value to set.
     */
    public void setMeasureUnit(String value) {
        this.measureUnit = value;
    }

    /**
     * Creates a new com.lareccete.product.kafka.ProductKafka RecordBuilder.
     * @return A new com.lareccete.product.kafka.ProductKafka RecordBuilder
     */
    public static ProductKafka.Builder newBuilder() {
        return new ProductKafka.Builder();
    }

    /**
     * Creates a new com.lareccete.product.kafka.ProductKafka RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new com.lareccete.product.kafka.ProductKafka RecordBuilder
     */
    public static ProductKafka.Builder newBuilder(ProductKafka.Builder other) {
        return new ProductKafka.Builder(other);
    }

    /**
     * Creates a new com.lareccete.product.kafka.ProductKafka RecordBuilder by copying an existing com.lareccete.product.kafka.ProductKafka instance.
     * @param other The existing instance to copy.
     * @return A new com.lareccete.product.kafka.ProductKafka RecordBuilder
     */
    public static ProductKafka.Builder newBuilder(ProductKafka other) {
        return new ProductKafka.Builder(other);
    }

    /**
     * RecordBuilder for com.lareccete.product.kafka.ProductKafka instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductKafka>
            implements org.apache.avro.data.RecordBuilder<ProductKafka> {

        private String id;
        private double proteins;
        private double carbohydrates;
        private double fats;
        private double calories;
        private String name;
        private String measureUnit;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(ProductKafka.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.proteins)) {
                this.proteins = data().deepCopy(fields()[1].schema(), other.proteins);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.carbohydrates)) {
                this.carbohydrates = data().deepCopy(fields()[2].schema(), other.carbohydrates);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.fats)) {
                this.fats = data().deepCopy(fields()[3].schema(), other.fats);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.calories)) {
                this.calories = data().deepCopy(fields()[4].schema(), other.calories);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.name)) {
                this.name = data().deepCopy(fields()[5].schema(), other.name);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.measureUnit)) {
                this.measureUnit = data().deepCopy(fields()[6].schema(), other.measureUnit);
                fieldSetFlags()[6] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing com.lareccete.product.kafka.ProductKafka instance
         * @param other The existing instance to copy.
         */
        private Builder(ProductKafka other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.proteins)) {
                this.proteins = data().deepCopy(fields()[1].schema(), other.proteins);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.carbohydrates)) {
                this.carbohydrates = data().deepCopy(fields()[2].schema(), other.carbohydrates);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.fats)) {
                this.fats = data().deepCopy(fields()[3].schema(), other.fats);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.calories)) {
                this.calories = data().deepCopy(fields()[4].schema(), other.calories);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.name)) {
                this.name = data().deepCopy(fields()[5].schema(), other.name);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.measureUnit)) {
                this.measureUnit = data().deepCopy(fields()[6].schema(), other.measureUnit);
                fieldSetFlags()[6] = true;
            }
        }

        /**
         * Gets the value of the 'id' field.
         * @return The value.
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the 'id' field.
         * @param value The value of 'id'.
         * @return This builder.
         */
        public ProductKafka.Builder setId(String value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set.
         * @return True if the 'id' field has been set, false otherwise.
         */
        public boolean hasId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'id' field.
         * @return This builder.
         */
        public ProductKafka.Builder clearId() {
            id = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'proteins' field.
         * @return The value.
         */
        public Double getProteins() {
            return proteins;
        }

        /**
         * Sets the value of the 'proteins' field.
         * @param value The value of 'proteins'.
         * @return This builder.
         */
        public ProductKafka.Builder setProteins(double value) {
            validate(fields()[1], value);
            this.proteins = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'proteins' field has been set.
         * @return True if the 'proteins' field has been set, false otherwise.
         */
        public boolean hasProteins() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'proteins' field.
         * @return This builder.
         */
        public ProductKafka.Builder clearProteins() {
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'carbohydrates' field.
         * @return The value.
         */
        public Double getCarbohydrates() {
            return carbohydrates;
        }

        /**
         * Sets the value of the 'carbohydrates' field.
         * @param value The value of 'carbohydrates'.
         * @return This builder.
         */
        public ProductKafka.Builder setCarbohydrates(double value) {
            validate(fields()[2], value);
            this.carbohydrates = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'carbohydrates' field has been set.
         * @return True if the 'carbohydrates' field has been set, false otherwise.
         */
        public boolean hasCarbohydrates() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'carbohydrates' field.
         * @return This builder.
         */
        public ProductKafka.Builder clearCarbohydrates() {
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'fats' field.
         * @return The value.
         */
        public Double getFats() {
            return fats;
        }

        /**
         * Sets the value of the 'fats' field.
         * @param value The value of 'fats'.
         * @return This builder.
         */
        public ProductKafka.Builder setFats(double value) {
            validate(fields()[3], value);
            this.fats = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'fats' field has been set.
         * @return True if the 'fats' field has been set, false otherwise.
         */
        public boolean hasFats() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'fats' field.
         * @return This builder.
         */
        public ProductKafka.Builder clearFats() {
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'calories' field.
         * @return The value.
         */
        public Double getCalories() {
            return calories;
        }

        /**
         * Sets the value of the 'calories' field.
         * @param value The value of 'calories'.
         * @return This builder.
         */
        public ProductKafka.Builder setCalories(double value) {
            validate(fields()[4], value);
            this.calories = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'calories' field has been set.
         * @return True if the 'calories' field has been set, false otherwise.
         */
        public boolean hasCalories() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'calories' field.
         * @return This builder.
         */
        public ProductKafka.Builder clearCalories() {
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'name' field.
         * @return The value.
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the 'name' field.
         * @param value The value of 'name'.
         * @return This builder.
         */
        public ProductKafka.Builder setName(String value) {
            validate(fields()[5], value);
            this.name = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'name' field has been set.
         * @return True if the 'name' field has been set, false otherwise.
         */
        public boolean hasName() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'name' field.
         * @return This builder.
         */
        public ProductKafka.Builder clearName() {
            name = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        /**
         * Gets the value of the 'measureUnit' field.
         * @return The value.
         */
        public String getMeasureUnit() {
            return measureUnit;
        }

        /**
         * Sets the value of the 'measureUnit' field.
         * @param value The value of 'measureUnit'.
         * @return This builder.
         */
        public ProductKafka.Builder setMeasureUnit(String value) {
            validate(fields()[6], value);
            this.measureUnit = value;
            fieldSetFlags()[6] = true;
            return this;
        }

        /**
         * Checks whether the 'measureUnit' field has been set.
         * @return True if the 'measureUnit' field has been set, false otherwise.
         */
        public boolean hasMeasureUnit() {
            return fieldSetFlags()[6];
        }


        /**
         * Clears the value of the 'measureUnit' field.
         * @return This builder.
         */
        public ProductKafka.Builder clearMeasureUnit() {
            measureUnit = null;
            fieldSetFlags()[6] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public ProductKafka build() {
            try {
                ProductKafka record = new ProductKafka();
                record.id = fieldSetFlags()[0] ? this.id : (String) defaultValue(fields()[0]);
                record.proteins = fieldSetFlags()[1] ? this.proteins : (Double) defaultValue(fields()[1]);
                record.carbohydrates = fieldSetFlags()[2] ? this.carbohydrates : (Double) defaultValue(fields()[2]);
                record.fats = fieldSetFlags()[3] ? this.fats : (Double) defaultValue(fields()[3]);
                record.calories = fieldSetFlags()[4] ? this.calories : (Double) defaultValue(fields()[4]);
                record.name = fieldSetFlags()[5] ? this.name : (String) defaultValue(fields()[5]);
                record.measureUnit = fieldSetFlags()[6] ? this.measureUnit : (String) defaultValue(fields()[6]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<ProductKafka>
            WRITER$ = (org.apache.avro.io.DatumWriter<ProductKafka>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<ProductKafka>
            READER$ = (org.apache.avro.io.DatumReader<ProductKafka>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

}
