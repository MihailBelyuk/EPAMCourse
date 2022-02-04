package com.belyuk.first_project.entity.comparator;

import com.belyuk.first_project.entity.SomeArray;
import java.util.Comparator;

public class SomeArrayLengthComparator implements Comparator<SomeArray> {

  @Override
  public int compare(SomeArray someArray1, SomeArray someArray2) {
    return someArray1.getArray().length-someArray2.getArray().length;
  }
}
