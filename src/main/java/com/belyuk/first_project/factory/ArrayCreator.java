package com.belyuk.first_project.factory;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;

public interface ArrayCreator {
  SomeArray createSomeArray(int[] array) throws SomeException;

}
