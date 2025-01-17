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

    strResult = MonthConversion.convertMonthWithSwitch(12);
    // assertion
    assertEquals("December", strResult);

    strResult = MonthConversion.convertMonthWithSwitch(13);
    // assertion
    assertEquals("No Such Month", strResult);

  }

  // TODO: add another test method to test the nested if implementation

}
