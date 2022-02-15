package com.belyuk.first_project.parser.impl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.belyuk.first_project.exception.SomeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CustomParserImplTest {
  public String DELIMITER = "\\s+";
  public String correctString = "15525 26545 52521 5122 566 ";
  public String incorrectString = "erwer wefwfw 55w2f3 f wf333 333 ";
  public int[] expectedArray = {15525, 26545, 52521, 5122, 566};

  @Test
  void shouldParseString() {
    if (correctString == null) {
      try {
        throw new SomeException("Provided string is null.");
      } catch (SomeException e) {
        e.printStackTrace();
      }
    }
    int[] intArray;
    String[] lineArray;
    lineArray = correctString.strip().split(DELIMITER);
    intArray = new int[lineArray.length];
    for (int i = 0; i < lineArray.length; i++) {
      intArray[i] = Integer.parseInt(lineArray[i]);
    }
    assertArrayEquals(expectedArray, intArray);
  }
  @Test
  void shouldFailToParseString() {

    if ( incorrectString == null) {
      try {
        throw new SomeException("Provided string is null.");
      } catch (SomeException e) {
        e.printStackTrace();
      }
    }
    int[] intArray;
    String[] lineArray;
    lineArray = correctString.strip().split(DELIMITER);
    intArray = new int[lineArray.length];
    for (int i = 0; i < lineArray.length; i++) {
      intArray[i] = Integer.parseInt(lineArray[i]);
    }
    assertNotEquals(expectedArray, intArray);

  }
}
