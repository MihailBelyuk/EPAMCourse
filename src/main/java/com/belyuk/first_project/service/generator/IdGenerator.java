package com.belyuk.first_project.service.generator;

public class IdGenerator {
  private static long iD = 0;

  private IdGenerator() {}

  public static long createId() {
    return ++iD;
  }
}
