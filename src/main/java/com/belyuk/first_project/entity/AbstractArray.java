package com.belyuk.first_project.entity;

import com.belyuk.first_project.observer.ArrayEvent;
import com.belyuk.first_project.observer.Observable;
import com.belyuk.first_project.observer.SomeArrayObserver;
import com.belyuk.first_project.util.IdGenerator;
import java.util.List;

public abstract class AbstractArray implements Observable {
  private long arrayId;
  private List<SomeArrayObserver> arrayObserverList;

  public AbstractArray() {
    this.arrayId = IdGenerator.createId();
  }

  public long getArrayId() {
    return arrayId;
  }

  public List<SomeArrayObserver> getArrayObserverList() {
    return arrayObserverList;
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
  public void notifyObservers() {
    if (!arrayObserverList.isEmpty()) {
      for (SomeArrayObserver observer : arrayObserverList) {
        observer.changeElement(new ArrayEvent(this));
      }
    }
  }
}
