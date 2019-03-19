/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ToggleVisibilityAction extends BaseActionElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ToggleVisibilityAction(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.ToggleVisibilityAction_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ToggleVisibilityAction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_ToggleVisibilityAction(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ToggleVisibilityAction() {
    this(AdaptiveCardObjectModelJNI.new_ToggleVisibilityAction(), true);
  }

  public ToggleVisibilityTargetVector GetTargetElements() {
    return new ToggleVisibilityTargetVector(AdaptiveCardObjectModelJNI.ToggleVisibilityAction_GetTargetElements__SWIG_0(swigCPtr, this), false);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.ToggleVisibilityAction_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static ToggleVisibilityAction dynamic_cast(BaseActionElement baseActionElement) {
    long cPtr = AdaptiveCardObjectModelJNI.ToggleVisibilityAction_dynamic_cast(BaseActionElement.getCPtr(baseActionElement), baseActionElement);
    return (cPtr == 0) ? null : new ToggleVisibilityAction(cPtr, true);
  }

}
