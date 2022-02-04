package com.belyuk.first_project.repository.impl;

import com.belyuk.first_project.entity.ArrayStatistics;
import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.entity.Warehouse;
import com.belyuk.first_project.repository.Specification;

public class SumValueSpecificationImpl implements Specification {
  private final Warehouse warehouse = Warehouse.getInstance();
  private final int sumValueProvided;

  public SumValueSpecificationImpl(int sumValueProvided) {
    this.sumValueProvided = sumValueProvided;
  }

  @Override
  public boolean specify(SomeArray someArray) {
    ArrayStatistics arrayStatistics = warehouse.get(someArray.getArrayId());
    return (sumValueProvided == arrayStatistics.getSum());
  }
}
