package com.belyuk.first_project.service.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.service.ServiceUtil;
import java.util.stream.IntStream;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceUtiIImplStream implements ServiceUtil {
  private static final Logger LOGGER = LogManager.getLogger();

  @Override
  public int countSum(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    return IntStream.of(array).sum();
  }

  @Override
  public int findMinValue(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    return IntStream.of(array).min().getAsInt();
  }

  @Override
  public int findMaxValue(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    IntStream.of(array).max().getAsInt();
    return IntStream.of(array).max().getAsInt();
  }

  @Override
  public double findAverageValue(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    return IntStream.of(array).average().getAsDouble();
  }

  @Override
  public int countNegativeValues(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    return (int) IntStream.of(array).filter(x -> x < 0).count();
  }

  @Override
  public int countPositiveValues(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    return (int) IntStream.of(array).filter(x -> x > 0).count();
  }

  @Override
  public int[] replace(SomeArray someArray, char forReplace) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray(); // TODO "replace" using IntStream
    return array;
  }
}
