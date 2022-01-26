package com.belyuk.first_project.sort;

import com.belyuk.first_project.entity.SomeArray;

public interface SortingUtil {
  int[] sortByBubble(SomeArray someArray);

  int[] sortBySelection(SomeArray someArray);

  int[] sortByInsertion(SomeArray someArray);

  int[] sortUsingIntStream(SomeArray someArray);
}
