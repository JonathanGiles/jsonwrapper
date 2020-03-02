/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package net.jonathangiles.tools.jed.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4771681487973199047L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message\",\"namespace\":\"net.jonathangiles.tools.jed.avro.model\",\"fields\":[{\"name\":\"isEmpty\",\"type\":\"boolean\"},{\"name\":\"sizeInBytes\",\"type\":\"int\"},{\"name\":\"sequenceNumber\",\"type\":\"long\"},{\"name\":\"cost\",\"type\":\"float\"},{\"name\":\"compressionRatio\",\"type\":\"double\"},{\"name\":\"data\",\"type\":\"bytes\"},{\"name\":\"messageId\",\"type\":\"string\"},{\"name\":\"source\",\"type\":{\"type\":\"enum\",\"name\":\"SourceType\",\"symbols\":[\"EVENTHUBS\",\"KAFKA\",\"KINESIS\"]}},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"properties\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"creationTime\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"timeToLiveInSeconds\",\"type\":{\"type\":\"long\",\"logicalType\":\"duration\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Message> ENCODER =
      new BinaryMessageEncoder<Message>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Message> DECODER =
      new BinaryMessageDecoder<Message>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Message> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Message> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Message> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Message>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Message to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Message from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Message instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Message fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public boolean isEmpty;
  @Deprecated public int sizeInBytes;
  @Deprecated public long sequenceNumber;
  @Deprecated public float cost;
  @Deprecated public double compressionRatio;
  @Deprecated public java.nio.ByteBuffer data;
  @Deprecated public java.lang.CharSequence messageId;
  @Deprecated public net.jonathangiles.tools.jed.avro.model.SourceType source;
  @Deprecated public java.util.List<java.lang.CharSequence> groups;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> properties;
  @Deprecated public java.time.Instant creationTime;
  @Deprecated public long timeToLiveInSeconds;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Message() {}

  /**
   * All-args constructor.
   * @param isEmpty The new value for isEmpty
   * @param sizeInBytes The new value for sizeInBytes
   * @param sequenceNumber The new value for sequenceNumber
   * @param cost The new value for cost
   * @param compressionRatio The new value for compressionRatio
   * @param data The new value for data
   * @param messageId The new value for messageId
   * @param source The new value for source
   * @param groups The new value for groups
   * @param properties The new value for properties
   * @param creationTime The new value for creationTime
   * @param timeToLiveInSeconds The new value for timeToLiveInSeconds
   */
  public Message(java.lang.Boolean isEmpty, java.lang.Integer sizeInBytes, java.lang.Long sequenceNumber, java.lang.Float cost, java.lang.Double compressionRatio, java.nio.ByteBuffer data, java.lang.CharSequence messageId, net.jonathangiles.tools.jed.avro.model.SourceType source, java.util.List<java.lang.CharSequence> groups, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> properties, java.time.Instant creationTime, java.lang.Long timeToLiveInSeconds) {
    this.isEmpty = isEmpty;
    this.sizeInBytes = sizeInBytes;
    this.sequenceNumber = sequenceNumber;
    this.cost = cost;
    this.compressionRatio = compressionRatio;
    this.data = data;
    this.messageId = messageId;
    this.source = source;
    this.groups = groups;
    this.properties = properties;
    this.creationTime = creationTime.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.timeToLiveInSeconds = timeToLiveInSeconds;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return isEmpty;
    case 1: return sizeInBytes;
    case 2: return sequenceNumber;
    case 3: return cost;
    case 4: return compressionRatio;
    case 5: return data;
    case 6: return messageId;
    case 7: return source;
    case 8: return groups;
    case 9: return properties;
    case 10: return creationTime;
    case 11: return timeToLiveInSeconds;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: isEmpty = (java.lang.Boolean)value$; break;
    case 1: sizeInBytes = (java.lang.Integer)value$; break;
    case 2: sequenceNumber = (java.lang.Long)value$; break;
    case 3: cost = (java.lang.Float)value$; break;
    case 4: compressionRatio = (java.lang.Double)value$; break;
    case 5: data = (java.nio.ByteBuffer)value$; break;
    case 6: messageId = (java.lang.CharSequence)value$; break;
    case 7: source = (net.jonathangiles.tools.jed.avro.model.SourceType)value$; break;
    case 8: groups = (java.util.List<java.lang.CharSequence>)value$; break;
    case 9: properties = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 10: creationTime = (java.time.Instant)value$; break;
    case 11: timeToLiveInSeconds = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'isEmpty' field.
   * @return The value of the 'isEmpty' field.
   */
  public boolean getIsEmpty() {
    return isEmpty;
  }


  /**
   * Sets the value of the 'isEmpty' field.
   * @param value the value to set.
   */
  public void setIsEmpty(boolean value) {
    this.isEmpty = value;
  }

  /**
   * Gets the value of the 'sizeInBytes' field.
   * @return The value of the 'sizeInBytes' field.
   */
  public int getSizeInBytes() {
    return sizeInBytes;
  }


  /**
   * Sets the value of the 'sizeInBytes' field.
   * @param value the value to set.
   */
  public void setSizeInBytes(int value) {
    this.sizeInBytes = value;
  }

  /**
   * Gets the value of the 'sequenceNumber' field.
   * @return The value of the 'sequenceNumber' field.
   */
  public long getSequenceNumber() {
    return sequenceNumber;
  }


  /**
   * Sets the value of the 'sequenceNumber' field.
   * @param value the value to set.
   */
  public void setSequenceNumber(long value) {
    this.sequenceNumber = value;
  }

  /**
   * Gets the value of the 'cost' field.
   * @return The value of the 'cost' field.
   */
  public float getCost() {
    return cost;
  }


  /**
   * Sets the value of the 'cost' field.
   * @param value the value to set.
   */
  public void setCost(float value) {
    this.cost = value;
  }

  /**
   * Gets the value of the 'compressionRatio' field.
   * @return The value of the 'compressionRatio' field.
   */
  public double getCompressionRatio() {
    return compressionRatio;
  }


  /**
   * Sets the value of the 'compressionRatio' field.
   * @param value the value to set.
   */
  public void setCompressionRatio(double value) {
    this.compressionRatio = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.nio.ByteBuffer getData() {
    return data;
  }


  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.nio.ByteBuffer value) {
    this.data = value;
  }

  /**
   * Gets the value of the 'messageId' field.
   * @return The value of the 'messageId' field.
   */
  public java.lang.CharSequence getMessageId() {
    return messageId;
  }


  /**
   * Sets the value of the 'messageId' field.
   * @param value the value to set.
   */
  public void setMessageId(java.lang.CharSequence value) {
    this.messageId = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return The value of the 'source' field.
   */
  public net.jonathangiles.tools.jed.avro.model.SourceType getSource() {
    return source;
  }


  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(net.jonathangiles.tools.jed.avro.model.SourceType value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'groups' field.
   * @return The value of the 'groups' field.
   */
  public java.util.List<java.lang.CharSequence> getGroups() {
    return groups;
  }


  /**
   * Sets the value of the 'groups' field.
   * @param value the value to set.
   */
  public void setGroups(java.util.List<java.lang.CharSequence> value) {
    this.groups = value;
  }

  /**
   * Gets the value of the 'properties' field.
   * @return The value of the 'properties' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getProperties() {
    return properties;
  }


  /**
   * Sets the value of the 'properties' field.
   * @param value the value to set.
   */
  public void setProperties(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.properties = value;
  }

  /**
   * Gets the value of the 'creationTime' field.
   * @return The value of the 'creationTime' field.
   */
  public java.time.Instant getCreationTime() {
    return creationTime;
  }


  /**
   * Sets the value of the 'creationTime' field.
   * @param value the value to set.
   */
  public void setCreationTime(java.time.Instant value) {
    this.creationTime = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'timeToLiveInSeconds' field.
   * @return The value of the 'timeToLiveInSeconds' field.
   */
  public long getTimeToLiveInSeconds() {
    return timeToLiveInSeconds;
  }


  /**
   * Sets the value of the 'timeToLiveInSeconds' field.
   * @param value the value to set.
   */
  public void setTimeToLiveInSeconds(long value) {
    this.timeToLiveInSeconds = value;
  }

  /**
   * Creates a new Message RecordBuilder.
   * @return A new Message RecordBuilder
   */
  public static net.jonathangiles.tools.jed.avro.model.Message.Builder newBuilder() {
    return new net.jonathangiles.tools.jed.avro.model.Message.Builder();
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Message RecordBuilder
   */
  public static net.jonathangiles.tools.jed.avro.model.Message.Builder newBuilder(net.jonathangiles.tools.jed.avro.model.Message.Builder other) {
    if (other == null) {
      return new net.jonathangiles.tools.jed.avro.model.Message.Builder();
    } else {
      return new net.jonathangiles.tools.jed.avro.model.Message.Builder(other);
    }
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Message instance.
   * @param other The existing instance to copy.
   * @return A new Message RecordBuilder
   */
  public static net.jonathangiles.tools.jed.avro.model.Message.Builder newBuilder(net.jonathangiles.tools.jed.avro.model.Message other) {
    if (other == null) {
      return new net.jonathangiles.tools.jed.avro.model.Message.Builder();
    } else {
      return new net.jonathangiles.tools.jed.avro.model.Message.Builder(other);
    }
  }

  /**
   * RecordBuilder for Message instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message>
    implements org.apache.avro.data.RecordBuilder<Message> {

    private boolean isEmpty;
    private int sizeInBytes;
    private long sequenceNumber;
    private float cost;
    private double compressionRatio;
    private java.nio.ByteBuffer data;
    private java.lang.CharSequence messageId;
    private net.jonathangiles.tools.jed.avro.model.SourceType source;
    private java.util.List<java.lang.CharSequence> groups;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> properties;
    private java.time.Instant creationTime;
    private long timeToLiveInSeconds;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(net.jonathangiles.tools.jed.avro.model.Message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.isEmpty)) {
        this.isEmpty = data().deepCopy(fields()[0].schema(), other.isEmpty);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.sizeInBytes)) {
        this.sizeInBytes = data().deepCopy(fields()[1].schema(), other.sizeInBytes);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.sequenceNumber)) {
        this.sequenceNumber = data().deepCopy(fields()[2].schema(), other.sequenceNumber);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.cost)) {
        this.cost = data().deepCopy(fields()[3].schema(), other.cost);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.compressionRatio)) {
        this.compressionRatio = data().deepCopy(fields()[4].schema(), other.compressionRatio);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.data)) {
        this.data = data().deepCopy(fields()[5].schema(), other.data);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.messageId)) {
        this.messageId = data().deepCopy(fields()[6].schema(), other.messageId);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.source)) {
        this.source = data().deepCopy(fields()[7].schema(), other.source);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.groups)) {
        this.groups = data().deepCopy(fields()[8].schema(), other.groups);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.properties)) {
        this.properties = data().deepCopy(fields()[9].schema(), other.properties);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.creationTime)) {
        this.creationTime = data().deepCopy(fields()[10].schema(), other.creationTime);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
      if (isValidValue(fields()[11], other.timeToLiveInSeconds)) {
        this.timeToLiveInSeconds = data().deepCopy(fields()[11].schema(), other.timeToLiveInSeconds);
        fieldSetFlags()[11] = other.fieldSetFlags()[11];
      }
    }

    /**
     * Creates a Builder by copying an existing Message instance
     * @param other The existing instance to copy.
     */
    private Builder(net.jonathangiles.tools.jed.avro.model.Message other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.isEmpty)) {
        this.isEmpty = data().deepCopy(fields()[0].schema(), other.isEmpty);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sizeInBytes)) {
        this.sizeInBytes = data().deepCopy(fields()[1].schema(), other.sizeInBytes);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sequenceNumber)) {
        this.sequenceNumber = data().deepCopy(fields()[2].schema(), other.sequenceNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.cost)) {
        this.cost = data().deepCopy(fields()[3].schema(), other.cost);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.compressionRatio)) {
        this.compressionRatio = data().deepCopy(fields()[4].schema(), other.compressionRatio);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.data)) {
        this.data = data().deepCopy(fields()[5].schema(), other.data);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.messageId)) {
        this.messageId = data().deepCopy(fields()[6].schema(), other.messageId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.source)) {
        this.source = data().deepCopy(fields()[7].schema(), other.source);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.groups)) {
        this.groups = data().deepCopy(fields()[8].schema(), other.groups);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.properties)) {
        this.properties = data().deepCopy(fields()[9].schema(), other.properties);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.creationTime)) {
        this.creationTime = data().deepCopy(fields()[10].schema(), other.creationTime);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.timeToLiveInSeconds)) {
        this.timeToLiveInSeconds = data().deepCopy(fields()[11].schema(), other.timeToLiveInSeconds);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'isEmpty' field.
      * @return The value.
      */
    public boolean getIsEmpty() {
      return isEmpty;
    }


    /**
      * Sets the value of the 'isEmpty' field.
      * @param value The value of 'isEmpty'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setIsEmpty(boolean value) {
      validate(fields()[0], value);
      this.isEmpty = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'isEmpty' field has been set.
      * @return True if the 'isEmpty' field has been set, false otherwise.
      */
    public boolean hasIsEmpty() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'isEmpty' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearIsEmpty() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sizeInBytes' field.
      * @return The value.
      */
    public int getSizeInBytes() {
      return sizeInBytes;
    }


    /**
      * Sets the value of the 'sizeInBytes' field.
      * @param value The value of 'sizeInBytes'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setSizeInBytes(int value) {
      validate(fields()[1], value);
      this.sizeInBytes = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sizeInBytes' field has been set.
      * @return True if the 'sizeInBytes' field has been set, false otherwise.
      */
    public boolean hasSizeInBytes() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sizeInBytes' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearSizeInBytes() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'sequenceNumber' field.
      * @return The value.
      */
    public long getSequenceNumber() {
      return sequenceNumber;
    }


    /**
      * Sets the value of the 'sequenceNumber' field.
      * @param value The value of 'sequenceNumber'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setSequenceNumber(long value) {
      validate(fields()[2], value);
      this.sequenceNumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'sequenceNumber' field has been set.
      * @return True if the 'sequenceNumber' field has been set, false otherwise.
      */
    public boolean hasSequenceNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'sequenceNumber' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearSequenceNumber() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'cost' field.
      * @return The value.
      */
    public float getCost() {
      return cost;
    }


    /**
      * Sets the value of the 'cost' field.
      * @param value The value of 'cost'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setCost(float value) {
      validate(fields()[3], value);
      this.cost = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'cost' field has been set.
      * @return True if the 'cost' field has been set, false otherwise.
      */
    public boolean hasCost() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'cost' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearCost() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'compressionRatio' field.
      * @return The value.
      */
    public double getCompressionRatio() {
      return compressionRatio;
    }


    /**
      * Sets the value of the 'compressionRatio' field.
      * @param value The value of 'compressionRatio'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setCompressionRatio(double value) {
      validate(fields()[4], value);
      this.compressionRatio = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'compressionRatio' field has been set.
      * @return True if the 'compressionRatio' field has been set, false otherwise.
      */
    public boolean hasCompressionRatio() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'compressionRatio' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearCompressionRatio() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getData() {
      return data;
    }


    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setData(java.nio.ByteBuffer value) {
      validate(fields()[5], value);
      this.data = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearData() {
      data = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'messageId' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessageId() {
      return messageId;
    }


    /**
      * Sets the value of the 'messageId' field.
      * @param value The value of 'messageId'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setMessageId(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.messageId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'messageId' field has been set.
      * @return True if the 'messageId' field has been set, false otherwise.
      */
    public boolean hasMessageId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'messageId' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearMessageId() {
      messageId = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * @return The value.
      */
    public net.jonathangiles.tools.jed.avro.model.SourceType getSource() {
      return source;
    }


    /**
      * Sets the value of the 'source' field.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setSource(net.jonathangiles.tools.jed.avro.model.SourceType value) {
      validate(fields()[7], value);
      this.source = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'source' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearSource() {
      source = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'groups' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getGroups() {
      return groups;
    }


    /**
      * Sets the value of the 'groups' field.
      * @param value The value of 'groups'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setGroups(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[8], value);
      this.groups = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'groups' field has been set.
      * @return True if the 'groups' field has been set, false otherwise.
      */
    public boolean hasGroups() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'groups' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearGroups() {
      groups = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'properties' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getProperties() {
      return properties;
    }


    /**
      * Sets the value of the 'properties' field.
      * @param value The value of 'properties'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setProperties(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[9], value);
      this.properties = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'properties' field has been set.
      * @return True if the 'properties' field has been set, false otherwise.
      */
    public boolean hasProperties() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'properties' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearProperties() {
      properties = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'creationTime' field.
      * @return The value.
      */
    public java.time.Instant getCreationTime() {
      return creationTime;
    }


    /**
      * Sets the value of the 'creationTime' field.
      * @param value The value of 'creationTime'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setCreationTime(java.time.Instant value) {
      validate(fields()[10], value);
      this.creationTime = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'creationTime' field has been set.
      * @return True if the 'creationTime' field has been set, false otherwise.
      */
    public boolean hasCreationTime() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'creationTime' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearCreationTime() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeToLiveInSeconds' field.
      * @return The value.
      */
    public long getTimeToLiveInSeconds() {
      return timeToLiveInSeconds;
    }


    /**
      * Sets the value of the 'timeToLiveInSeconds' field.
      * @param value The value of 'timeToLiveInSeconds'.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder setTimeToLiveInSeconds(long value) {
      validate(fields()[11], value);
      this.timeToLiveInSeconds = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'timeToLiveInSeconds' field has been set.
      * @return True if the 'timeToLiveInSeconds' field has been set, false otherwise.
      */
    public boolean hasTimeToLiveInSeconds() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'timeToLiveInSeconds' field.
      * @return This builder.
      */
    public net.jonathangiles.tools.jed.avro.model.Message.Builder clearTimeToLiveInSeconds() {
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Message build() {
      try {
        Message record = new Message();
        record.isEmpty = fieldSetFlags()[0] ? this.isEmpty : (java.lang.Boolean) defaultValue(fields()[0]);
        record.sizeInBytes = fieldSetFlags()[1] ? this.sizeInBytes : (java.lang.Integer) defaultValue(fields()[1]);
        record.sequenceNumber = fieldSetFlags()[2] ? this.sequenceNumber : (java.lang.Long) defaultValue(fields()[2]);
        record.cost = fieldSetFlags()[3] ? this.cost : (java.lang.Float) defaultValue(fields()[3]);
        record.compressionRatio = fieldSetFlags()[4] ? this.compressionRatio : (java.lang.Double) defaultValue(fields()[4]);
        record.data = fieldSetFlags()[5] ? this.data : (java.nio.ByteBuffer) defaultValue(fields()[5]);
        record.messageId = fieldSetFlags()[6] ? this.messageId : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.source = fieldSetFlags()[7] ? this.source : (net.jonathangiles.tools.jed.avro.model.SourceType) defaultValue(fields()[7]);
        record.groups = fieldSetFlags()[8] ? this.groups : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[8]);
        record.properties = fieldSetFlags()[9] ? this.properties : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[9]);
        record.creationTime = fieldSetFlags()[10] ? this.creationTime : (java.time.Instant) defaultValue(fields()[10]);
        record.timeToLiveInSeconds = fieldSetFlags()[11] ? this.timeToLiveInSeconds : (java.lang.Long) defaultValue(fields()[11]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Message>
    WRITER$ = (org.apache.avro.io.DatumWriter<Message>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Message>
    READER$ = (org.apache.avro.io.DatumReader<Message>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









