/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class RichTextBlock extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected RichTextBlock(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.RichTextBlock_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RichTextBlock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_RichTextBlock(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RichTextBlock() {
    this(AdaptiveCardObjectModelJNI.new_RichTextBlock__SWIG_0(), true);
  }

  public RichTextBlock(RichTextBlock arg0) {
    this(AdaptiveCardObjectModelJNI.new_RichTextBlock__SWIG_1(RichTextBlock.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.RichTextBlock_SerializeToJsonValue(swigCPtr, this), true);
  }

  public boolean GetWrap() {
    return AdaptiveCardObjectModelJNI.RichTextBlock_GetWrap(swigCPtr, this);
  }

  public void SetWrap(boolean value) {
    AdaptiveCardObjectModelJNI.RichTextBlock_SetWrap(swigCPtr, this, value);
  }

  public long GetMaxLines() {
    return AdaptiveCardObjectModelJNI.RichTextBlock_GetMaxLines(swigCPtr, this);
  }

  public void SetMaxLines(long value) {
    AdaptiveCardObjectModelJNI.RichTextBlock_SetMaxLines(swigCPtr, this, value);
  }

  public HorizontalAlignment GetHorizontalAlignment() {
    return HorizontalAlignment.swigToEnum(AdaptiveCardObjectModelJNI.RichTextBlock_GetHorizontalAlignment(swigCPtr, this));
  }

  public void SetHorizontalAlignment(HorizontalAlignment value) {
    AdaptiveCardObjectModelJNI.RichTextBlock_SetHorizontalAlignment(swigCPtr, this, value.swigValue());
  }

  public ParagraphVector GetParagraphs() {
    return new ParagraphVector(AdaptiveCardObjectModelJNI.RichTextBlock_GetParagraphs__SWIG_0(swigCPtr, this), false);
  }

  public static RichTextBlock dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.RichTextBlock_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new RichTextBlock(cPtr, true);
  }

}
