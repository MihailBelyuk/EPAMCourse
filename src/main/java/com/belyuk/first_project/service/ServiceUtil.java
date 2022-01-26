package com.belyuk.first_project.service;

import com.belyuk.first_project.entity.SomeArray;

public interface ServiceUtil {
  int countSum(SomeArray someArray);

  int findMinValue(SomeArray someArray);

  int findMaxValue(SomeArray someArray);

  double findAverageValue(SomeArray someArray);

  int countNegativeValues(SomeArray someArray);

  int countPositiveValues(SomeArray someArray);

  int[] replace(SomeArray someArray);
}
