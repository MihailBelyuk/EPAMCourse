package com.belyuk.first_project.service.math_service;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ServiceUtil {
  int countSum(SomeArray someArray) throws SomeException;

  int findMinValue(SomeArray someArray) throws SomeException;

  int findMaxValue(SomeArray someArray) throws SomeException;

  double  findAverageValue(SomeArray someArray) throws SomeException;

  int countNegativeValues(SomeArray someArray) throws SomeException;

  int countPositiveValues(SomeArray someArray) throws SomeException;

  int[] replace(SomeArray someArray, int forReplace) throws SomeException;
}