package com.belyuk.first_project.repository;

import com.belyuk.first_project.entity.SomeArray;
import java.util.ArrayList;
import java.util.List;

public class ArrayRepository {
  private static ArrayRepository arrayRepository = new ArrayRepository();

  private ArrayRepository() {}

  public static ArrayRepository getInstance() {
    return arrayRepository;
  }

  private List<SomeArray> listWithArrays;

  public void addSomeArray(SomeArray someArray) {
    listWithArrays.add(someArray);
  }

  public void removeSomeArray(SomeArray someArray) {
    listWithArrays.remove(someArray);
  }

  public boolean addAll(List<SomeArray> list) {
    return listWithArrays.addAll(list);
  }

  public boolean removeAll(List<SomeArray> list) {
    return listWithArrays.removeAll(list);
  }

  public List<SomeArray> query(Specification specification) {
    List<SomeArray> someArrayList = new ArrayList<>();
    for (SomeArray someArray : listWithArrays) {
      if (specification.specify(someArray)) {
        someArrayList.add(someArray);
      }
    }
    return someArrayList;
  }

  public List<SomeArray> queryStream(Specification specification) {
    List<SomeArray> someArrayList;
    someArrayList = listWithArrays.stream().filter(specification::specify).toList();
    return someArrayList;
  }
}
