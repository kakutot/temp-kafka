/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package test.kafka;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum EventType {
  CREATE, UPDATE, DELETE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"EventType\",\"namespace\":\"kafka\",\"symbols\":[\"CREATE\",\"UPDATE\",\"DELETE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}