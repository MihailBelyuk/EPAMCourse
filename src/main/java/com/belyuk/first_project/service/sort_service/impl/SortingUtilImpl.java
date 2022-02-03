package com.belyuk.first_project.service.sort_service.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.service.sort_service.SortingUtil;
import java.util.stream.IntStream;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortingUtilImpl implements SortingUtil {
  private static final Logger LOGGER = LogManager.getLogger();

  @Override
  public SomeArray sortByBubble(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    int count;
    do {
      count = 0;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          count++;
        }
      }
    } while (count > 0);
    return someArray;
  }

  @Override
  public SomeArray sortBySelection(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    for (int i = 0; i < array.length; i++) {
      int minValue = array[i];
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < minValue) {
          minValue = array[j];
          minIndex = j;
        }
      }
      if (i != minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
    }
    return someArray;
  }

  @Override
  public SomeArray sortByInsertion(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    for (int i = 0; i < array.length; i++) {
      int index = i;
      int temp = array[i];
      while (index > 0 && array[index - 1] >= temp) {
        array[index] = array[index - 1];
        index--;
      }
      array[index] = temp;
    }
    return someArray;
  }

  @Override
  public SomeArray sortUsingIntStream(SomeArray someArray) throws SomeException {
    if (someArray == null) {
      LOGGER.log(Level.ERROR, "Method parameter is null.");
      throw new SomeException("Method parameter is null.");
    }
    int[] array = someArray.getArray();
    array = IntStream.of(array).sorted().toArray();
    return someArray;
  }
}
