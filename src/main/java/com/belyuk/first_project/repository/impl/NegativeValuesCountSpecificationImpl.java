package com.belyuk.first_project.repository.impl;

import com.belyuk.first_project.entity.ArrayStatistics;
import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.entity.Warehouse;
import com.belyuk.first_project.repository.Specification;

public class NegativeValuesCountSpecificationImpl implements Specification {
  private final Warehouse warehouse = Warehouse.getInstance();
  private final int negValueCountProvided;

  public NegativeValuesCountSpecificationImpl(int negValueCountProvided) {
    this.negValueCountProvided = negValueCountProvided;
  }

  @Override
  public boolean specify(SomeArray someArray) {
    ArrayStatistics arrayStatistics = warehouse.get(someArray.getArrayId());
    return (negValueCountProvided == arrayStatistics.getNegativeValues());
  }
}
