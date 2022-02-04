package com.belyuk.first_project.validator;

public interface Validator {
  boolean validateFilePath(String filePath);
  boolean validateFileInfo(String informationFromFile);
}
