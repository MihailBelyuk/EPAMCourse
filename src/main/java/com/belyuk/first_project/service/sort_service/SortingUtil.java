package com.belyuk.first_project.service.sort_service;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;

public interface SortingUtil {
  int[] sortByBubble(SomeArray someArray) throws SomeException;

  int[] sortBySelection(SomeArray someArray) throws SomeException;

  int[] sortByInsertion(SomeArray someArray) throws SomeException;

  int[] sortUsingIntStream(SomeArray someArray) throws SomeException;
}
