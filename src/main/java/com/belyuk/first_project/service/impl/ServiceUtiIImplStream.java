package com.belyuk.first_project.service.impl;

import com.belyuk.first_project.service.ServiceUtil;
import java.util.stream.IntStream;

public class ServiceUtiIImplStream implements ServiceUtil {

  @Override
  public int countSum(int[] array) {
    return IntStream.of(array).sum();
  }

  @Override
  public int findMinValue(int[] array) {
    return IntStream.of(array).min().getAsInt();
  }

  @Override
  public int findMaxValue(int[] array) {
    return IntStream.of(array).max().getAsInt();
  }

  @Override
  public double findAverageValue(int[] array) {
    return IntStream.of(array).average().getAsDouble();
  }

  @Override
  public int countNegativeValues(int[] array) {
    return (int) IntStream.of(array).filter(x -> x < 0).count();
  }

  @Override
  public int countPositiveValues(int[] array) {
    return (int) IntStream.of(array).filter(x -> x > 0).count();
  }

  @Override
  public int[] replace(int[] array) {  //TODO replace using IntStream

       return array;
  }
}
