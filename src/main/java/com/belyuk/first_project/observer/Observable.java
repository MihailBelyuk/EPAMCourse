package com.belyuk.first_project.observer;

import com.belyuk.first_project.exception.SomeException;

public interface Observable {
  void attach(SomeArrayObserver observer);

  void detach(SomeArrayObserver observer);

  void notifyObservers() throws SomeException;
}
