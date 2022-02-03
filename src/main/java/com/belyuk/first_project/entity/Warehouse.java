package com.belyuk.first_project.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
  private static final Warehouse warehouse = new Warehouse();
  private Map<Long, ArrayStatistics> map = new HashMap<Long, ArrayStatistics>();

  private Warehouse() {}

  public ArrayStatistics get(Long key) {
    return map.get(key);
  }

  public ArrayStatistics put(Long key, ArrayStatistics value) {
    return map.put(key, value);
  }

  public ArrayStatistics remove(Integer key) {
    return map.remove(key);
  }

  public ArrayStatistics replace(Long key, ArrayStatistics value) {
    return map.replace(key, value);
  }

  public static Warehouse getInstance() {
    return warehouse;
  }
}
