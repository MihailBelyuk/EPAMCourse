package com.belyuk.first_project.entity;

import java.util.Map;

public class Warehouse {
  private static final Warehouse warehouse = new Warehouse();


  private Warehouse() {
  }
  public static Warehouse getInstance(){
    return warehouse;
  }
}
