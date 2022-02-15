package com.belyuk.first_project.service.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.service.ArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayServiceImpl implements ArrayService {
  private static final Logger logger = LogManager.getLogger();


  @Override
  public int countSum(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      logger.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    int result = 0;
    for (int j : array) {
      result += j;
    }
    return result;
  }

  @Override
  public int findMinValue(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      logger.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    int min = array[0];
    for (int j : array) {
      if (min > j) {
        min = j;
      }
    }
    return min;
  }

  @Override
  public int findMaxValue(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      logger.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    int max = array[0];
    for (int j : array) {
      if (max < j) {
        max = j;
      }
    }
    return max;
  }

  @Override
  public double findAverageValue(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      logger.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    double sum = 0;
    for (int j : array) {
      sum += j;
    }
    return sum / array.length;
  }

  @Override
  public int countNegativeValues(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      logger.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    int negativeValues = 0;
    for (int j : array) {
      if (j < 0) {
        negativeValues++;
      }
    }
    return negativeValues;
  }

  @Override
  public int countPositiveValues(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      logger.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    int positiveValues = 0;
    for (int j : array) {
      if (j < 0) {
        positiveValues++;
      }
    }
    return positiveValues;
  }

  @Override
  public int[] replace(SomeArray someArray, int forReplace) throws SomeException {
    if (someArray == null) {
      logger.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray(); // replace all negative values with "0"
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        array[i] = forReplace;
      }
    }
    return array;
  }
}
