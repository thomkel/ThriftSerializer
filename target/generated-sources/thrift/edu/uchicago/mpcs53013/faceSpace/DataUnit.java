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

public class DataUnit extends org.apache.thrift.TUnion<DataUnit, DataUnit._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataUnit");
  private static final org.apache.thrift.protocol.TField PERSON_PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("person_property", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RELATIONSHIP_EDGE_FIELD_DESC = new org.apache.thrift.protocol.TField("relationship_edge", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PERSON_PROPERTY((short)1, "person_property"),
    RELATIONSHIP_EDGE((short)2, "relationship_edge");

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
        case 1: // PERSON_PROPERTY
          return PERSON_PROPERTY;
        case 2: // RELATIONSHIP_EDGE
          return RELATIONSHIP_EDGE;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERSON_PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("person_property", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PersonProperty.class)));
    tmpMap.put(_Fields.RELATIONSHIP_EDGE, new org.apache.thrift.meta_data.FieldMetaData("relationship_edge", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RelationshipEdge.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataUnit.class, metaDataMap);
  }

  public DataUnit() {
    super();
  }

  public DataUnit(_Fields setField, Object value) {
    super(setField, value);
  }

  public DataUnit(DataUnit other) {
    super(other);
  }
  public DataUnit deepCopy() {
    return new DataUnit(this);
  }

  public static DataUnit person_property(PersonProperty value) {
    DataUnit x = new DataUnit();
    x.setPerson_property(value);
    return x;
  }

  public static DataUnit relationship_edge(RelationshipEdge value) {
    DataUnit x = new DataUnit();
    x.setRelationship_edge(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case PERSON_PROPERTY:
        if (value instanceof PersonProperty) {
          break;
        }
        throw new ClassCastException("Was expecting value of type PersonProperty for field 'person_property', but got " + value.getClass().getSimpleName());
      case RELATIONSHIP_EDGE:
        if (value instanceof RelationshipEdge) {
          break;
        }
        throw new ClassCastException("Was expecting value of type RelationshipEdge for field 'relationship_edge', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case PERSON_PROPERTY:
          if (field.type == PERSON_PROPERTY_FIELD_DESC.type) {
            PersonProperty person_property;
            person_property = new PersonProperty();
            person_property.read(iprot);
            return person_property;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case RELATIONSHIP_EDGE:
          if (field.type == RELATIONSHIP_EDGE_FIELD_DESC.type) {
            RelationshipEdge relationship_edge;
            relationship_edge = new RelationshipEdge();
            relationship_edge.read(iprot);
            return relationship_edge;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PERSON_PROPERTY:
        PersonProperty person_property = (PersonProperty)value_;
        person_property.write(oprot);
        return;
      case RELATIONSHIP_EDGE:
        RelationshipEdge relationship_edge = (RelationshipEdge)value_;
        relationship_edge.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case PERSON_PROPERTY:
          PersonProperty person_property;
          person_property = new PersonProperty();
          person_property.read(iprot);
          return person_property;
        case RELATIONSHIP_EDGE:
          RelationshipEdge relationship_edge;
          relationship_edge = new RelationshipEdge();
          relationship_edge.read(iprot);
          return relationship_edge;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PERSON_PROPERTY:
        PersonProperty person_property = (PersonProperty)value_;
        person_property.write(oprot);
        return;
      case RELATIONSHIP_EDGE:
        RelationshipEdge relationship_edge = (RelationshipEdge)value_;
        relationship_edge.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case PERSON_PROPERTY:
        return PERSON_PROPERTY_FIELD_DESC;
      case RELATIONSHIP_EDGE:
        return RELATIONSHIP_EDGE_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public PersonProperty getPerson_property() {
    if (getSetField() == _Fields.PERSON_PROPERTY) {
      return (PersonProperty)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'person_property' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPerson_property(PersonProperty value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.PERSON_PROPERTY;
    value_ = value;
  }

  public RelationshipEdge getRelationship_edge() {
    if (getSetField() == _Fields.RELATIONSHIP_EDGE) {
      return (RelationshipEdge)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'relationship_edge' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRelationship_edge(RelationshipEdge value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.RELATIONSHIP_EDGE;
    value_ = value;
  }

  public boolean isSetPerson_property() {
    return setField_ == _Fields.PERSON_PROPERTY;
  }


  public boolean isSetRelationship_edge() {
    return setField_ == _Fields.RELATIONSHIP_EDGE;
  }


  public boolean equals(Object other) {
    if (other instanceof DataUnit) {
      return equals((DataUnit)other);
    } else {
      return false;
    }
  }

  public boolean equals(DataUnit other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(DataUnit other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    HashCodeBuilder hcb = new HashCodeBuilder();
    hcb.append(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      hcb.append(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        hcb.append(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        hcb.append(value);
      }
    }
    return hcb.toHashCode();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
