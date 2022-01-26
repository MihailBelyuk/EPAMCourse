package com.belyuk.first_project.service;

import com.belyuk.first_project.entity.SomeArray;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ServiceUtil {
  int countSum(SomeArray someArray);

  OptionalInt findMinValue(SomeArray someArray);

  OptionalInt findMaxValue(SomeArray someArray);

  OptionalDouble findAverageValue(SomeArray someArray);

  int countNegativeValues(SomeArray someArray);

  int countPositiveValues(SomeArray someArray);

  int[] replace(SomeArray someArray);
}
