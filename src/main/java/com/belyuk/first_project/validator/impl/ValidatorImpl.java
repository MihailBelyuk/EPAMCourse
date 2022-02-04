package com.belyuk.first_project.validator.impl;

import com.belyuk.first_project.validator.Validator;
import java.io.File;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidatorImpl implements Validator {
  private static final Logger logger = LogManager.getLogger();
  private static final ValidatorImpl validator = new ValidatorImpl();
  private static final String FILE_INFO_VALIDATOR = "^\\s*-?\\d{1,10}(\\s+(-?\\d{1,10}))*\\s*$";

  private ValidatorImpl() {}

  public static Validator getInstance() {
    return validator;
  }

  @Override
  public boolean validateFilePath(String filePath) {
    boolean isValid = false;
    if (filePath != null) {
      File file = new File(filePath);
      if (file.exists() && file.length() > 0) {
        isValid = true;
        logger.log(Level.INFO, "File path is valid.");
      }
    }
    return isValid;
  }

  @Override
  public boolean validateFileInfo(String informationFromFile) {
        return informationFromFile.matches(FILE_INFO_VALIDATOR);
  }
}
