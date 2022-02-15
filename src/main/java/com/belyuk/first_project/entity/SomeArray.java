package com.belyuk.first_project.entity;

import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.observer.SomeArrayObserver;
import java.util.Arrays;
import java.util.StringJoiner;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeArray extends AbstractArray {
  private static final Logger logger = LogManager.getLogger();
  private int[] array;

  public SomeArray(int[] array) throws SomeException {
    if (array != null) {
      this.array = Arrays.copyOf(array, array.length);
    } else {
      throw new SomeException("Array is null.");
    }
  }

  public SomeArrayObserver get(int index) {
    return getArrayObserverList().get(index);
  }

  public void setElement(int index, int value) throws SomeException {
    if (index < 0 || index > array.length) {
      logger.log(Level.ERROR, "Incorrect index or value.");
      throw new SomeException("Incorrect index or value.");
    }
    array[index] = value;
    notifyObservers();
  }

  public void setArray(int[] array) throws SomeException {
    if (array == null) {
      logger.log(Level.ERROR, "Provided array is null.");
      throw new SomeException("Provided array is null.");
    }
    this.array = Arrays.copyOf(array, array.length);
    notifyObservers();
  }

  public int[] getArray() {
    return Arrays.copyOf(array, array.length);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SomeArray someArray = (SomeArray) o;
    return Arrays.equals(array, someArray.array);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(array);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("SomeArray{");
    sb.append("array=").append(Arrays.toString(array));
    sb.append('}');
    return sb.toString();
  }
}
