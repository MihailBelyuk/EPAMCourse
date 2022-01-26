package com.belyuk.first_project.service.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.service.ServiceUtil;
import java.util.stream.IntStream;

public class ServiceUtiIImplStream implements ServiceUtil {

  @Override
  public int countSum(SomeArray someArray) {
    int[] array = someArray.getArray();
    int sum = IntStream.of(array).sum();
    return sum;
  }

  @Override
  public int findMinValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    int minValue = IntStream.of(array).min().getAsInt();
    return minValue;
  }

  @Override
  public int findMaxValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    int maxValue = IntStream.of(array).max().getAsInt();
    return maxValue;
  }

  @Override
  public double findAverageValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    return IntStream.of(array).average().getAsDouble();
  }

  @Override
  public int countNegativeValues(SomeArray someArray) {
    int[] array = someArray.getArray();
    return (int) IntStream.of(array).filter(x -> x < 0).count();
  }

  @Override
  public int countPositiveValues(SomeArray someArray) {
    int[] array = someArray.getArray();
    return (int) IntStream.of(array).filter(x -> x > 0).count();
  }

  @Override
  public int[] replace(SomeArray someArray) {
    int[] array = someArray.getArray();          //TODO "replace" using IntStream
       return array;
  }
}
