/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class BaseCardElement extends BaseElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BaseCardElement(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.BaseCardElement_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseCardElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_BaseCardElement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AdaptiveCardObjectModelJNI.BaseCardElement_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AdaptiveCardObjectModelJNI.BaseCardElement_change_ownership(this, swigCPtr, true);
  }

  // check if the C++ code finds an object and just return ourselves if it doesn't
  public BaseCardElement findImplObj() {
     Object o = swigOriginalObject();
     return o != null ? (BaseCardElement)o : this;
  }

  public BaseCardElement(CardElementType type, Spacing spacing, boolean separator, HeightType height) {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElement__SWIG_0(type.swigValue(), spacing.swigValue(), separator, height.swigValue()), true);
    AdaptiveCardObjectModelJNI.BaseCardElement_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public BaseCardElement(CardElementType type) {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElement__SWIG_1(type.swigValue()), true);
    AdaptiveCardObjectModelJNI.BaseCardElement_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public BaseCardElement() {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElement__SWIG_2(), true);
    AdaptiveCardObjectModelJNI.BaseCardElement_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public BaseCardElement(BaseCardElement arg0) {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElement__SWIG_3(BaseCardElement.getCPtr(arg0), arg0), true);
    AdaptiveCardObjectModelJNI.BaseCardElement_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue((getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_SerializeToJsonValue(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_SerializeToJsonValueSwigExplicitBaseCardElement(swigCPtr, this), true);
  }

  public boolean GetSeparator() {
    return (getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetSeparator(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetSeparatorSwigExplicitBaseCardElement(swigCPtr, this);
  }

  public void SetSeparator(boolean value) {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_SetSeparator(swigCPtr, this, value); else AdaptiveCardObjectModelJNI.BaseCardElement_SetSeparatorSwigExplicitBaseCardElement(swigCPtr, this, value);
  }

  public HeightType GetHeight() {
    return HeightType.swigToEnum(AdaptiveCardObjectModelJNI.BaseCardElement_GetHeight(swigCPtr, this));
  }

  public void SetHeight(HeightType value) {
    AdaptiveCardObjectModelJNI.BaseCardElement_SetHeight(swigCPtr, this, value.swigValue());
  }

  public Spacing GetSpacing() {
    return Spacing.swigToEnum((getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetSpacing(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetSpacingSwigExplicitBaseCardElement(swigCPtr, this));
  }

  public void SetSpacing(Spacing value) {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_SetSpacing(swigCPtr, this, value.swigValue()); else AdaptiveCardObjectModelJNI.BaseCardElement_SetSpacingSwigExplicitBaseCardElement(swigCPtr, this, value.swigValue());
  }

  public boolean GetIsVisible() {
    return (getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetIsVisible(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetIsVisibleSwigExplicitBaseCardElement(swigCPtr, this);
  }

  public void SetIsVisible(boolean value) {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_SetIsVisible(swigCPtr, this, value); else AdaptiveCardObjectModelJNI.BaseCardElement_SetIsVisibleSwigExplicitBaseCardElement(swigCPtr, this, value);
  }

  public long GetMinHeight() {
    return (getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetMinHeight(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetMinHeightSwigExplicitBaseCardElement(swigCPtr, this);
  }

  public void SetMinHeight(long value) {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_SetMinHeight(swigCPtr, this, value); else AdaptiveCardObjectModelJNI.BaseCardElement_SetMinHeightSwigExplicitBaseCardElement(swigCPtr, this, value);
  }

  public CardElementType GetElementType() {
    return CardElementType.swigToEnum((getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetElementType(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetElementTypeSwigExplicitBaseCardElement(swigCPtr, this));
  }

  public static void ParseJsonObject(ParseContext context, JsonValue json, BaseElement element) {
    AdaptiveCardObjectModelJNI.BaseCardElement_ParseJsonObject(ParseContext.getCPtr(context), context, JsonValue.getCPtr(json), json, BaseElement.getCPtr(element), element);
  }

  protected void PopulateKnownPropertiesSet() {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_PopulateKnownPropertiesSet(swigCPtr, this); else AdaptiveCardObjectModelJNI.BaseCardElement_PopulateKnownPropertiesSetSwigExplicitBaseCardElement(swigCPtr, this);
  }

  public Object swigOriginalObject() {
    return AdaptiveCardObjectModelJNI.BaseCardElement_swigOriginalObject(swigCPtr, this);
  }

}
