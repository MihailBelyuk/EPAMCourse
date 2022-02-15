package com.belyuk.first_project.reader.impl;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CustomReaderImplTest {
  public String filePath = null;

  @Test
  void shouldThrowNullPointerException() {
    Executable executable = () -> CustomReaderImpl.getInstance().readFile(filePath);
    assertThrowsExactly(NullPointerException.class, executable);
  }
}
