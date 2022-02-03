package com.belyuk.first_project.observer.impl;

import com.belyuk.first_project.entity.ArrayStatistics;
import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.entity.Warehouse;
import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.observer.SomeArrayObserver;
import com.belyuk.first_project.service.math_service.impl.ServiceUtilImpl;

public class SomeArrayObserverIImpl implements SomeArrayObserver {

  @Override
  public void changeElement(SomeArray someArray) throws SomeException {
    ServiceUtilImpl serviceUtil = new ServiceUtilImpl();
    int max = serviceUtil.findMaxValue(someArray);
    int min = serviceUtil.findMinValue(someArray);
    double average = serviceUtil.findAverageValue(someArray);
    int sum = serviceUtil.countSum(someArray);
    int negativeValues = serviceUtil.countNegativeValues(someArray);
    int positiveValues = serviceUtil.countPositiveValues(someArray);
    ArrayStatistics statistics =
        new ArrayStatistics(max, min, average, sum, negativeValues, positiveValues);

    int arrayId = someArray.getArrayId();

    Warehouse warehouse = Warehouse.getInstance();
    warehouse.replace(arrayId, statistics);
  }
}
