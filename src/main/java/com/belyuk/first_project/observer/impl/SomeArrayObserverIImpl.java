package com.belyuk.first_project.observer.impl;

import com.belyuk.first_project.observer.ArrayEvent;
import com.belyuk.first_project.entity.ArrayStatistics;
import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.entity.Warehouse;
import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.observer.SomeArrayObserver;
import com.belyuk.first_project.service.impl.ArrayServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeArrayObserverIImpl implements SomeArrayObserver {
  private static final Logger logger = LogManager.getLogger();

  @Override
  public void changeElement(ArrayEvent event) {
    SomeArray someArray=(SomeArray) event.getSource();
    ArrayServiceImpl serviceUtil = new ArrayServiceImpl();
    int max = 0;
    int min = 0;
    double average = 0;
    int sum = 0;
    int negativeValues = 0;
    int positiveValues = 0;
    try {
      max = serviceUtil.findMaxValue(someArray);
      min = serviceUtil.findMinValue(someArray);
      average = serviceUtil.findAverageValue(someArray);
      sum = serviceUtil.countSum(someArray);
      negativeValues = serviceUtil.countNegativeValues(someArray);
      positiveValues = serviceUtil.countPositiveValues(someArray);
    } catch (SomeException e) {
      logger.log(Level.ERROR, "Provided parameter is null.");
      e.printStackTrace();
    }
    ArrayStatistics statistics =
        new ArrayStatistics(max, min, average, sum, negativeValues, positiveValues);

    long arrayId = someArray.getArrayId();

    Warehouse warehouse = Warehouse.getInstance();
    warehouse.replace(arrayId, statistics);
  }
}
