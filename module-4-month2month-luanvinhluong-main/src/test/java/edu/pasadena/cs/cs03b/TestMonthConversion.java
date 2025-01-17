package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestMonthConversion {

  @Test
  public void testMonthConversionWithSwitch() {
    // action
    String strResult = MonthConversion.convertMonthWithSwitch(1);
    // assertion
    assertEquals("January", strResult);

     // TODO: Add more test cases from February to November
     strResult = MonthConversion.convertMonthWithSwitch(2);
     assertEquals("February", strResult);

     strResult = MonthConversion.convertMonthWithSwitch(3);
     assertEquals("March", strResult);


     strResult = MonthConversion.convertMonthWithSwitch(4);
     assertEquals("April", strResult);


     strResult = MonthConversion.convertMonthWithSwitch(5);
     assertEquals("May", strResult);


     strResult = MonthConversion.convertMonthWithSwitch(6);
     assertEquals("June", strResult);


     strResult = MonthConversion.convertMonthWithSwitch(7);
     assertEquals("July", strResult);


     strResult = MonthConversion.convertMonthWithSwitch(8);
     assertEquals("August", strResult);


     strResult = MonthConversion.convertMonthWithSwitch(9);
     assertEquals("September", strResult);


     strResult = MonthConversion.convertMonthWithSwitch(10);
     assertEquals("October", strResult);


     strResult = MonthConversion.convertMonthWithSwitch(11);
     // assertion
     assertEquals("November", strResult);

     strResult = MonthConversion.convertMonthWithSwitch(12);
     assertEquals("December", strResult);

     strResult = MonthConversion.convertMonthWithSwitch(13);
     // assertion
     assertEquals("No Such Month", strResult);     

  }
  @Test
   public void testMonthConversionWithNestedIf(){
      assertEquals("January", MonthConversion.convertMonthWithNestedIf(1));
      assertEquals("February", MonthConversion.convertMonthWithNestedIf(2));
      assertEquals("March", MonthConversion.convertMonthWithNestedIf(3));
      assertEquals("April", MonthConversion.convertMonthWithNestedIf(4));
      assertEquals("May", MonthConversion.convertMonthWithNestedIf(5));
      assertEquals("June", MonthConversion.convertMonthWithNestedIf(6));
      assertEquals("July", MonthConversion.convertMonthWithNestedIf(7));
      assertEquals("August", MonthConversion.convertMonthWithNestedIf(8));
      assertEquals("September", MonthConversion.convertMonthWithNestedIf(9));
      assertEquals("October", MonthConversion.convertMonthWithNestedIf(10));
      assertEquals("November", MonthConversion.convertMonthWithNestedIf(11));
      assertEquals("December", MonthConversion.convertMonthWithNestedIf(12));
   }
  // TODO: add another test method to test the nested if implementation

}
