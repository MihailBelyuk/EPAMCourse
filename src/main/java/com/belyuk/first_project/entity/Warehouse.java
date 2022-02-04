package com.belyuk.first_project.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
  private static final Warehouse warehouse = new Warehouse();
  private final Map<Long, ArrayStatistics> storageOfSomeArrayStatistics = new HashMap<>();

  private Warehouse() {}

  public static Warehouse getInstance() {
    return warehouse;
  }

  public ArrayStatistics get(Long key) {
    return storageOfSomeArrayStatistics.get(key);
  }

  public ArrayStatistics put(Long key, ArrayStatistics value) {
    return storageOfSomeArrayStatistics.put(key, value);
  }

  public ArrayStatistics remove(Long key) {
    return storageOfSomeArrayStatistics.remove(key);
  }

  public ArrayStatistics replace(Long key, ArrayStatistics value) {
    return storageOfSomeArrayStatistics.replace(key, value);
  }
}
