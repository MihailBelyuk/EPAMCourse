package com.belyuk.first_project.validator.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import org.junit.jupiter.api.Test;

class ValidatorImplTest {
  public String informationFromFile = "1555625 3256 253 6363";
  public String FILE_INFO_VALIDATOR = "^\\s*-?\\d{1,10}(\\s+(-?\\d{1,10}))*\\s*$";
  public String filePath = "data\\testfile.txt";
  public String wrongFilePath = "data\\testfil.txt";

  @Test
  void filePathShouldBeValid() {
    File file = new File(filePath);
    boolean isValid = filePath != null & file.exists() & file.length() > 0;
    assertTrue(isValid);
  }

  @Test
  void filePathShouldNotBeValid() {
    boolean valid;
    valid = ValidatorImpl.getInstance().validateFilePath(wrongFilePath);
    assertFalse(valid);
  }

  @Test
  void fileInformationShouldBeValid() {
    boolean valid = informationFromFile.matches(FILE_INFO_VALIDATOR);
    assertTrue(valid);
  }
}
