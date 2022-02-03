package com.belyuk.first_project.repository;

import com.belyuk.first_project.entity.SomeArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Repository {
  private List<SomeArray> listWithArrays;

  public void addSomeArray(SomeArray someArray) {
    this.listWithArrays.add(someArray);
  }

  public void removeSomeArray(SomeArray someArray) {
    this.listWithArrays.remove(someArray);
  }

  public boolean addAll(List<SomeArray> c) {
    return listWithArrays.addAll(c);
  }

  public boolean removeAll(Collection<SomeArray> c) {
    return listWithArrays.removeAll(c);
  }

  public List<SomeArray> query(Specification specification) {
    List<SomeArray> list = new ArrayList<>();
    for (SomeArray someArray : listWithArrays) {
      if (specification.specify(someArray)) {
        list.add(someArray);
      }
    }
    return list;
  }

  public List<SomeArray> queryStream(Specification specification) {
      return listWithArrays.stream().filter(x -> x == specification).toList();
  }
}
