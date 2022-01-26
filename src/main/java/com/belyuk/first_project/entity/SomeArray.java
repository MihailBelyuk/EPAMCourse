package com.belyuk.first_project.entity;

import java.util.Arrays;

public class SomeArray {
  private int[] array;

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

  public void setArray(int[] array) {
    this.array = Arrays.copyOf(array, array.length);
  }

  public int[] getArray() {
    return Arrays.copyOf(array, array.length);
  }
}
