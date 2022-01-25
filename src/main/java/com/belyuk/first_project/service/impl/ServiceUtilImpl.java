package com.belyuk.first_project.service.impl;

import com.belyuk.first_project.service.ServiceUtil;

public class ServiceUtilImpl implements ServiceUtil {

  @Override
  public int countSum(int[] array) {
    int result = 0;
    for (int i = 0; i < array.length; i++) {
      result += array[i];
    }
    return result;
  }

  @Override
  public int findMinValue(int[] array) {
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    return min;
  }

  @Override
  public int findMaxValue(int[] array) {
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }

  @Override
  public double findAverageValue(int[] array) {
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    double averageValue = sum / array.length;
    return averageValue;
  }

  @Override
  public int countNegativeValues(int[] array) {
    int negativeValues = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        negativeValues++;
      }
    }
    return negativeValues;
  }

  @Override
  public int countPositiveValues(int[] array) {
    int positiveValues = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        positiveValues++;
      }
    }
    return positiveValues;
  }

  @Override
  public int[] replace(int[] array) {         // replace all negative values with "0"
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        array[i] = 0;
      }
    }
    return array;
  }
}
