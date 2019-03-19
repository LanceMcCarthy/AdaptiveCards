/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class Inline {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Inline(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Inline obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_Inline(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Inline(InlineElementType type) {
    this(AdaptiveCardObjectModelJNI.new_Inline__SWIG_0(type.swigValue()), true);
  }

  public Inline() {
    this(AdaptiveCardObjectModelJNI.new_Inline__SWIG_1(), true);
  }

  public Inline(Inline arg0) {
    this(AdaptiveCardObjectModelJNI.new_Inline__SWIG_2(Inline.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.Inline_SerializeToJsonValue(swigCPtr, this), true);
  }

  public InlineElementType GetInlineType() {
    return InlineElementType.swigToEnum(AdaptiveCardObjectModelJNI.Inline_GetInlineType(swigCPtr, this));
  }

  public String GetInlineTypeString() {
    return AdaptiveCardObjectModelJNI.Inline_GetInlineTypeString(swigCPtr, this);
  }

  public static Inline Deserialize(ParseContext context, JsonValue root) {
    long cPtr = AdaptiveCardObjectModelJNI.Inline_Deserialize(ParseContext.getCPtr(context), context, JsonValue.getCPtr(root), root);
    return (cPtr == 0) ? null : new Inline(cPtr, true);
  }

  public JsonValue GetAdditionalProperties() {
    return new JsonValue(AdaptiveCardObjectModelJNI.Inline_GetAdditionalProperties(swigCPtr, this), true);
  }

  public void SetAdditionalProperties(JsonValue additionalProperties) {
    AdaptiveCardObjectModelJNI.Inline_SetAdditionalProperties(swigCPtr, this, JsonValue.getCPtr(additionalProperties), additionalProperties);
  }

}
