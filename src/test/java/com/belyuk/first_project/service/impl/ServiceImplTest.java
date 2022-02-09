package com.belyuk.first_project.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServiceImplTest {
  ServiceImpl serviceImpl;
  SomeArray someArray;

  @BeforeEach
  void setUp() throws SomeException {
    int[] array = {1, 3, 5, 2};
    serviceImpl = new ServiceImpl();
    someArray = new SomeArray(array);
  }

  @Test
  void expectedSumShouldEqualActual() throws SomeException {
    int expected = 11;
    int actual = serviceImpl.countSum(someArray);
    assertEquals(expected, actual);
  }

  @Test
  void findMinValue() throws SomeException {
    int expected = 1;
    int actual = serviceImpl.findMinValue(someArray);
    assertEquals(expected, actual);
  }

  @Test
  void findMaxValue() throws SomeException {
    int expected = 5;
    int actual = serviceImpl.findMaxValue(someArray);
    assertEquals(expected, actual);
  }

  @Test
  void findAverageValue() throws SomeException {
    double expected = 5.5;
    double actual = serviceImpl.findAverageValue(someArray);
    assertEquals(expected, actual);
  }

  @Test
  void countNegativeValues() throws SomeException {
    int expected = 0;
    int actual = serviceImpl.countNegativeValues(someArray);
    assertEquals(expected, actual);
  }

  @Test
  void countPositiveValues() throws SomeException {
    int expected = 4;
    int actual = serviceImpl.countPositiveValues(someArray);
    assertEquals(expected, actual);
  }

  @Test
  void replace() throws SomeException {
    int[] expected = {1, 3, 5, 2};
    int[] actual = serviceImpl.replace(someArray, 0);
    boolean compare = Arrays.equals(expected, actual);
    assertTrue(compare);
  }
}
