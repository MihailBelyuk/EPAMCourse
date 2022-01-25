package com.belyuk.first_project.sort.impl;

import com.belyuk.first_project.sort.SortingUtil;
import java.util.stream.IntStream;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortingUtilImpl implements SortingUtil {
  static Logger logger = LogManager.getLogger();

  @Override
  public int[] sortByBubble(int[] array) {
    try {
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
    } catch (NullPointerException e) {
      logger.log(Level.ERROR, e.getMessage());
    }
    return array;
  }

  @Override
  public int[] sortBySelection(int[] array) {
    try {
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
    } catch (NullPointerException e) {
      logger.log(Level.ERROR, e.getMessage());
    }
    return array;
  }

  @Override
  public int[] sortByInsertion(int[] array) {
    try {
      for (int i = 0; i < array.length; i++) {
        int index = i;
        int temp = array[i];
        while (index > 0 && array[index - 1] >= temp) {
          array[index] = array[index - 1];
          index--;
        }
        array[index] = temp;
      }
    } catch (NullPointerException e) {
      logger.log(Level.ERROR, e.getMessage());
    }
    return array;
  }

  @Override
  public int[] sortUsingIntStream(int[] array) {
    try {
      array = IntStream.of(array).sorted().toArray();
    } catch (NullPointerException e) {
      logger.log(Level.ERROR, e.getMessage());
    }
    return array;
  }
}
