/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.uchicago.mpcs53013.faceSpace;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum GenderType implements org.apache.thrift.TEnum {
  MALE(1),
  FEMALE(2);

  private final int value;

  private GenderType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static GenderType findByValue(int value) { 
    switch (value) {
      case 1:
        return MALE;
      case 2:
        return FEMALE;
      default:
        return null;
    }
  }
}
