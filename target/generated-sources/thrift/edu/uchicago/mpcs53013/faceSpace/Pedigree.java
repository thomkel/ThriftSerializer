/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.uchicago.mpcs53013.faceSpace;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pedigree implements org.apache.thrift.TBase<Pedigree, Pedigree._Fields>, java.io.Serializable, Cloneable, Comparable<Pedigree> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pedigree");

  private static final org.apache.thrift.protocol.TField TRUE_AS_OF_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("true_as_of_secs", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PedigreeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PedigreeTupleSchemeFactory());
  }

  public int true_as_of_secs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRUE_AS_OF_SECS((short)1, "true_as_of_secs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TRUE_AS_OF_SECS
          return TRUE_AS_OF_SECS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TRUE_AS_OF_SECS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRUE_AS_OF_SECS, new org.apache.thrift.meta_data.FieldMetaData("true_as_of_secs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pedigree.class, metaDataMap);
  }

  public Pedigree() {
  }

  public Pedigree(
    int true_as_of_secs)
  {
    this();
    this.true_as_of_secs = true_as_of_secs;
    setTrue_as_of_secsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pedigree(Pedigree other) {
    __isset_bitfield = other.__isset_bitfield;
    this.true_as_of_secs = other.true_as_of_secs;
  }

  public Pedigree deepCopy() {
    return new Pedigree(this);
  }

  @Override
  public void clear() {
    setTrue_as_of_secsIsSet(false);
    this.true_as_of_secs = 0;
  }

  public int getTrue_as_of_secs() {
    return this.true_as_of_secs;
  }

  public Pedigree setTrue_as_of_secs(int true_as_of_secs) {
    this.true_as_of_secs = true_as_of_secs;
    setTrue_as_of_secsIsSet(true);
    return this;
  }

  public void unsetTrue_as_of_secs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID);
  }

  /** Returns true if field true_as_of_secs is set (has been assigned a value) and false otherwise */
  public boolean isSetTrue_as_of_secs() {
    return EncodingUtils.testBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID);
  }

  public void setTrue_as_of_secsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRUE_AS_OF_SECS:
      if (value == null) {
        unsetTrue_as_of_secs();
      } else {
        setTrue_as_of_secs((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRUE_AS_OF_SECS:
      return Integer.valueOf(getTrue_as_of_secs());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRUE_AS_OF_SECS:
      return isSetTrue_as_of_secs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Pedigree)
      return this.equals((Pedigree)that);
    return false;
  }

  public boolean equals(Pedigree that) {
    if (that == null)
      return false;

    boolean this_present_true_as_of_secs = true;
    boolean that_present_true_as_of_secs = true;
    if (this_present_true_as_of_secs || that_present_true_as_of_secs) {
      if (!(this_present_true_as_of_secs && that_present_true_as_of_secs))
        return false;
      if (this.true_as_of_secs != that.true_as_of_secs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_true_as_of_secs = true;
    builder.append(present_true_as_of_secs);
    if (present_true_as_of_secs)
      builder.append(true_as_of_secs);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(Pedigree other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTrue_as_of_secs()).compareTo(other.isSetTrue_as_of_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrue_as_of_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.true_as_of_secs, other.true_as_of_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Pedigree(");
    boolean first = true;

    sb.append("true_as_of_secs:");
    sb.append(this.true_as_of_secs);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'true_as_of_secs' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PedigreeStandardSchemeFactory implements SchemeFactory {
    public PedigreeStandardScheme getScheme() {
      return new PedigreeStandardScheme();
    }
  }

  private static class PedigreeStandardScheme extends StandardScheme<Pedigree> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRUE_AS_OF_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.true_as_of_secs = iprot.readI32();
              struct.setTrue_as_of_secsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetTrue_as_of_secs()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'true_as_of_secs' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Pedigree struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TRUE_AS_OF_SECS_FIELD_DESC);
      oprot.writeI32(struct.true_as_of_secs);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PedigreeTupleSchemeFactory implements SchemeFactory {
    public PedigreeTupleScheme getScheme() {
      return new PedigreeTupleScheme();
    }
  }

  private static class PedigreeTupleScheme extends TupleScheme<Pedigree> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.true_as_of_secs);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.true_as_of_secs = iprot.readI32();
      struct.setTrue_as_of_secsIsSet(true);
    }
  }

}
