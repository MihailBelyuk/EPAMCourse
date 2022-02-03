package com.belyuk.first_project.repository.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.repository.Specification;

public class IdSpecification implements Specification {
  private int exactId;

  public IdSpecification(int exactId) {
    this.exactId = exactId;
  }

  @Override
  public boolean specify(SomeArray someArray) {
    return exactId == someArray.getArrayId();
  }
}
