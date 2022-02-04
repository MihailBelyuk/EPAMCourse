package com.belyuk.first_project.repository.impl;

import com.belyuk.first_project.entity.ArrayStatistics;
import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.entity.Warehouse;
import com.belyuk.first_project.repository.Specification;

public class AverageValueOfArrayElementsSpecificationImpl implements Specification {
  private final  Warehouse warehouse = Warehouse.getInstance();
  private final double avValueProvided;

  public AverageValueOfArrayElementsSpecificationImpl(double avValueProvided) {
    this.avValueProvided = avValueProvided;
  }

  @Override
  public boolean specify(SomeArray someArray) {
    ArrayStatistics arrayStatistics = warehouse.get(someArray.getArrayId());
    return (avValueProvided == arrayStatistics.getAverage());
  }
}
