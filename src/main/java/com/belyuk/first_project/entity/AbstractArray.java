package com.belyuk.first_project.entity;

import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.observer.Observable;
import com.belyuk.first_project.observer.SomeArrayObserver;
import java.util.List;

public abstract class AbstractArray implements Observable {
  private long arrayId;
  private List<SomeArrayObserver> arrayObserverList;

  public AbstractArray() {
    this.arrayId = IdGenerator.getIdCount();
  }

  public long getArrayId() {
    return arrayId;
  }

  public void setArrayId(int arrayId) {
    this.arrayId = arrayId;
  }

  public List<SomeArrayObserver> getArrayObserverList() {
    return arrayObserverList;
  }

  public void setArrayObserverList(List<SomeArrayObserver> arrayObserverList) {
    this.arrayObserverList = arrayObserverList;
  }

  @Override
  public void attach(SomeArrayObserver observer) {}

  @Override
  public void detach(SomeArrayObserver observer) {}

  @Override
  public void notifyObservers() throws SomeException {}
}
