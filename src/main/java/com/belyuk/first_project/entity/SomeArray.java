package com.belyuk.first_project.entity;

import com.belyuk.first_project.exception.SomeException;
import java.util.Arrays;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeArray {
  private static final Logger LOGGER = LogManager.getLogger();
  private long arrayId;
  private int[] array;


  {
    this.arrayId = IdGenerator.getIdCount();
  }

  public SomeArray(int[] array) throws SomeException {
    if (array == null) {
      LOGGER.log(Level.ERROR, "Provided array is null.");
      throw new SomeException("Provided array is null.");
    }
    this.array = array;
  }

  public void setArray(int index, int value) throws SomeException {
    if (index < 0 || index > array.length) {
      LOGGER.log(Level.ERROR, "Index is out off array length bounds.");
      throw new SomeException("Index is out off array length bounds.");
    } else array[index] = value;
  }

  public long getArrayId() {
    return arrayId;
  }

  public void setArray(int[] array) {
    this.array = Arrays.copyOf(array, array.length);
  }

  public int[] getArray() throws SomeException {
    if (this.array.length == 0) {
      throw new SomeException("Array is empty.");
    }
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
}
