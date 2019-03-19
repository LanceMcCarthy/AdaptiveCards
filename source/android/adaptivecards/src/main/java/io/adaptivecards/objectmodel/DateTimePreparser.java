/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class DateTimePreparser {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DateTimePreparser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DateTimePreparser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_DateTimePreparser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DateTimePreparser() {
    this(AdaptiveCardObjectModelJNI.new_DateTimePreparser__SWIG_0(), true);
  }

  public DateTimePreparser(String in) {
    this(AdaptiveCardObjectModelJNI.new_DateTimePreparser__SWIG_1(in), true);
  }

  public DateTimePreparsedTokenVector GetTextTokens() {
    return new DateTimePreparsedTokenVector(AdaptiveCardObjectModelJNI.DateTimePreparser_GetTextTokens(swigCPtr, this), true);
  }

  public boolean HasDateTokens() {
    return AdaptiveCardObjectModelJNI.DateTimePreparser_HasDateTokens(swigCPtr, this);
  }

  public static boolean TryParseSimpleTime(String string, SWIGTYPE_p_unsigned_int hours, SWIGTYPE_p_unsigned_int minutes) {
    return AdaptiveCardObjectModelJNI.DateTimePreparser_TryParseSimpleTime(string, SWIGTYPE_p_unsigned_int.getCPtr(hours), SWIGTYPE_p_unsigned_int.getCPtr(minutes));
  }

  public static boolean TryParseSimpleDate(String string, SWIGTYPE_p_unsigned_int year, SWIGTYPE_p_unsigned_int month, SWIGTYPE_p_unsigned_int day) {
    return AdaptiveCardObjectModelJNI.DateTimePreparser_TryParseSimpleDate(string, SWIGTYPE_p_unsigned_int.getCPtr(year), SWIGTYPE_p_unsigned_int.getCPtr(month), SWIGTYPE_p_unsigned_int.getCPtr(day));
  }

}
