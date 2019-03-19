/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class TextElementProperties {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected TextElementProperties(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextElementProperties obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_TextElementProperties(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TextElementProperties() {
    this(AdaptiveCardObjectModelJNI.new_TextElementProperties__SWIG_0(), true);
  }

  public TextElementProperties(TextElementProperties arg0) {
    this(AdaptiveCardObjectModelJNI.new_TextElementProperties__SWIG_1(TextElementProperties.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue(JsonValue root) {
    return new JsonValue(AdaptiveCardObjectModelJNI.TextElementProperties_SerializeToJsonValue(swigCPtr, this, JsonValue.getCPtr(root), root), true);
  }

  public String GetText() {
    return AdaptiveCardObjectModelJNI.TextElementProperties_GetText(swigCPtr, this);
  }

  public void SetText(String value) {
    AdaptiveCardObjectModelJNI.TextElementProperties_SetText(swigCPtr, this, value);
  }

  public DateTimePreparser GetTextForDateParsing() {
    return new DateTimePreparser(AdaptiveCardObjectModelJNI.TextElementProperties_GetTextForDateParsing(swigCPtr, this), true);
  }

  public TextSize GetTextSize() {
    return TextSize.swigToEnum(AdaptiveCardObjectModelJNI.TextElementProperties_GetTextSize(swigCPtr, this));
  }

  public void SetTextSize(TextSize value) {
    AdaptiveCardObjectModelJNI.TextElementProperties_SetTextSize(swigCPtr, this, value.swigValue());
  }

  public TextWeight GetTextWeight() {
    return TextWeight.swigToEnum(AdaptiveCardObjectModelJNI.TextElementProperties_GetTextWeight(swigCPtr, this));
  }

  public void SetTextWeight(TextWeight value) {
    AdaptiveCardObjectModelJNI.TextElementProperties_SetTextWeight(swigCPtr, this, value.swigValue());
  }

  public FontStyle GetFontStyle() {
    return FontStyle.swigToEnum(AdaptiveCardObjectModelJNI.TextElementProperties_GetFontStyle(swigCPtr, this));
  }

  public void SetFontStyle(FontStyle value) {
    AdaptiveCardObjectModelJNI.TextElementProperties_SetFontStyle(swigCPtr, this, value.swigValue());
  }

  public ForegroundColor GetTextColor() {
    return ForegroundColor.swigToEnum(AdaptiveCardObjectModelJNI.TextElementProperties_GetTextColor(swigCPtr, this));
  }

  public void SetTextColor(ForegroundColor value) {
    AdaptiveCardObjectModelJNI.TextElementProperties_SetTextColor(swigCPtr, this, value.swigValue());
  }

  public boolean GetIsSubtle() {
    return AdaptiveCardObjectModelJNI.TextElementProperties_GetIsSubtle(swigCPtr, this);
  }

  public void SetIsSubtle(boolean value) {
    AdaptiveCardObjectModelJNI.TextElementProperties_SetIsSubtle(swigCPtr, this, value);
  }

  public void SetLanguage(String value) {
    AdaptiveCardObjectModelJNI.TextElementProperties_SetLanguage(swigCPtr, this, value);
  }

  public String GetLanguage() {
    return AdaptiveCardObjectModelJNI.TextElementProperties_GetLanguage(swigCPtr, this);
  }

  public void Deserialize(ParseContext context, JsonValue root) {
    AdaptiveCardObjectModelJNI.TextElementProperties_Deserialize(swigCPtr, this, ParseContext.getCPtr(context), context, JsonValue.getCPtr(root), root);
  }

  public void PopulateKnownPropertiesSet(SWIGTYPE_p_std__unordered_setT_std__string_t knownProperties) {
    AdaptiveCardObjectModelJNI.TextElementProperties_PopulateKnownPropertiesSet(swigCPtr, this, SWIGTYPE_p_std__unordered_setT_std__string_t.getCPtr(knownProperties));
  }

}
