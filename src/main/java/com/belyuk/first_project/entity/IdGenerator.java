package com.belyuk.first_project.entity;

public class IdGenerator {
  private static int iD = 0;

  private IdGenerator() {}

  public static int getIdCount() {
    return ++iD;
  }
}
