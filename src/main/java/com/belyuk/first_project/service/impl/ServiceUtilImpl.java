package com.belyuk.first_project.service.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.service.ServiceUtil;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ServiceUtilImpl implements ServiceUtil {

  @Override
  public int countSum(SomeArray someArray) {
    int[] array = someArray.getArray();
    int result = 0;
    for (int i = 0; i < array.length; i++) {
      result += array[i];
    }
    return result;
  }

  @Override
  public OptionalInt findMinValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    return OptionalInt.of(min);
  }

  @Override
  public OptionalInt findMaxValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return OptionalInt.of(max);
  }

  @Override
  public OptionalDouble findAverageValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    double averageValue = sum / array.length;
    return OptionalDouble.of(averageValue);
  }

  @Override
  public int countNegativeValues(SomeArray someArray) {
    int[] array = someArray.getArray();
    int negativeValues = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        negativeValues++;
      }
    }
    return negativeValues;
  }

  @Override
  public int countPositiveValues(SomeArray someArray) {
    int[] array = someArray.getArray();
    int positiveValues = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        positiveValues++;
      }
    }
    return positiveValues;
  }

  @Override
  public int[] replace(SomeArray someArray) {
    int[] array = someArray.getArray(); // replace all negative values with "0"
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        array[i] = 0;
      }
    }
    return array;
  }
}
