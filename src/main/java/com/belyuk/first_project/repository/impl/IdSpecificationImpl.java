package com.belyuk.first_project.repository.impl;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.repository.Specification;

public class IdSpecificationImpl implements Specification {
  private long idProvided;

  public IdSpecificationImpl(long idProvided) {
    this.idProvided = idProvided;
  }

  @Override
  public boolean specify(SomeArray someArray) {
    return (idProvided == someArray.getArrayId());
  }
}
