package com.belyuk.first_project.observer;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;

public interface SomeArrayObserver {
  void changeElement(SomeArray someArray) throws SomeException;
}
