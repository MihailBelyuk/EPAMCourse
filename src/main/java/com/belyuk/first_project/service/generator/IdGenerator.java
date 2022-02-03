package com.belyuk.first_project.service.generator;

public class IdGenerator {
  private static final long MIN_ID = 0;
  private static final long MAX_ID = 1000;
  private static long counter;

  private IdGenerator() {}

  public static long createId() {
    ++counter;
    if (MIN_ID + counter >= MAX_ID) {
      counter = 0;
    }
    long iD = counter;
    return iD;
  }
}
