package com.belyuk.first_project.entity;

import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.observer.SomeArrayObserver;
import java.util.Arrays;
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

  public void setElement(int index, int value) throws SomeException {
    if (index >= 0 && index < array.length) {
      array[index] = value;
      notifyObservers();
    } else {
      throw new SomeException("Incorrect index or value.");
    }
  }

  public void setArray(int[] array) throws SomeException {
    if (array != null) {
      this.array = Arrays.copyOf(array, array.length);
      notifyObservers();
    } else {
      throw new SomeException("Array is null.");
    }
  }

  public int[] getArray() {
    return Arrays.copyOf(array, array.length);
  }

  @Override
  public void notifyObservers() {
    if (!arrayObserverList.isEmpty()) {
      for (SomeArrayObserver observer : arrayObserverList) {
        observer.changeElement(this);
      }
    }
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
  } //TODO переписать вручную

  @Override
  public String toString() {//TODO переписать вручную
    return "SomeArray{" + "array=" + Arrays.toString(array) + '}';
  }
}
