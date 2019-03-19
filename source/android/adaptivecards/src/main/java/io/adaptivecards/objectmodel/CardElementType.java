/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum CardElementType {
  ActionSet(0),
  AdaptiveCard,
  ChoiceInput,
  ChoiceSetInput,
  Column,
  ColumnSet,
  Container,
  Custom,
  DateInput,
  Fact,
  FactSet,
  Image,
  ImageSet,
  Media,
  NumberInput,
  RichTextBlock,
  TextBlock,
  TextInput,
  TimeInput,
  ToggleInput,
  Unknown;

  public final int swigValue() {
    return swigValue;
  }

  public static CardElementType swigToEnum(int swigValue) {
    CardElementType[] swigValues = CardElementType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (CardElementType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + CardElementType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private CardElementType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private CardElementType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private CardElementType(CardElementType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

