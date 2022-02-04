package com.belyuk.first_project.factory.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.factory.ArrayCreator;

public class ArrayCreatorImpl implements ArrayCreator {
  private static final ArrayCreatorImpl arrayCreatorImpl = new ArrayCreatorImpl();

  private ArrayCreatorImpl() {}

  public static ArrayCreatorImpl getInstance() {
    return arrayCreatorImpl;
  }

  @Override
  public SomeArray createSomeArray(int[] array) throws SomeException {
    return new SomeArray(array);
  }
}
