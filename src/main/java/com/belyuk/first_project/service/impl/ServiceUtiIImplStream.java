package com.belyuk.first_project.service.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.service.ServiceUtil;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ServiceUtiIImplStream implements ServiceUtil {

  @Override
  public int countSum(SomeArray someArray) {
    int[] array = someArray.getArray();
    int sum = IntStream.of(array).sum();
    return sum;
  }

  @Override
  public OptionalInt findMinValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    OptionalInt minValue = IntStream.of(array).min();
    return minValue;
  }

  @Override
  public OptionalInt findMaxValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    OptionalInt maxValue = IntStream.of(array).max();
    return maxValue;
  }

  @Override
  public OptionalDouble findAverageValue(SomeArray someArray) {
    int[] array = someArray.getArray();
    OptionalDouble averageValue = IntStream.of(array).average();
    return averageValue;
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
    int[] array = someArray.getArray(); // TODO "replace" using IntStream
    return array;
  }
}
