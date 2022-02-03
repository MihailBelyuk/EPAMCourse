package com.belyuk.first_project.service.sort_service;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;

public interface SortingUtil {
  SomeArray sortByBubble(SomeArray someArray) throws SomeException;

  SomeArray sortBySelection(SomeArray someArray) throws SomeException;

  SomeArray sortByInsertion(SomeArray someArray) throws SomeException;

  SomeArray sortUsingIntStream(SomeArray someArray) throws SomeException;
}
