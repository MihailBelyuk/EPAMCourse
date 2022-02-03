package com.belyuk.first_project.entity;

import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.observer.SomeArrayObserver;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeArray extends AbstractArray {
  private static final Logger LOGGER = LogManager.getLogger();
  private int[] array;

  public SomeArray(int arrayId, List<SomeArrayObserver> arrayObserverList, int[] array)
      throws SomeException {
    super(arrayId);
    if (array == null) {
      LOGGER.log(Level.ERROR, "Provided array is null.");
      throw new SomeException("Provided array is null.");
    }
    this.array = Arrays.copyOf(array, array.length);
  }

  public void setElement(int index, int value) throws SomeException {
    if (index >= 0 && index < array.length) {
      array[index] = value;
      notifyObservers();
    }
  }

  public void setArray(int[] array) {
    this.array = Arrays.copyOf(array, array.length);
  }

  public int[] getArray() {
    return Arrays.copyOf(array, array.length);
  }

  @Override
  public String toString() {
    return "SomeArray{" + "array=" + Arrays.toString(array) + '}';
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
  public void attach(SomeArrayObserver observer) {
    getArrayObserverList().add(observer);
  }

  @Override
  public void detach(SomeArrayObserver observer) {
    getArrayObserverList().remove(observer);
  }

  @Override
  public void notifyObservers() throws SomeException {
    for (SomeArrayObserver observer : getArrayObserverList()) {
      observer.changeElement(this);
    }
  }
}
