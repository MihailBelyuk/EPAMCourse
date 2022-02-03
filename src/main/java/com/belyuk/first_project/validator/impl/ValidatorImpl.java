package com.belyuk.first_project.validator.impl;

import com.belyuk.first_project.validator.Validator;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidatorImpl implements Validator {
  private static final Logger LOGGER = LogManager.getLogger();
  private static final ValidatorImpl validator = new ValidatorImpl();

  private ValidatorImpl() {}

  public static Validator getInstance() {
    return validator;
  }

  @Override
  public boolean validateFileInfo(String filePath) {
    boolean isValid = false;
    if(filePath == null){
      isValid = false;
    }
    File file = new File(filePath);
    if (file == null) {
      isValid = false;
    } else {
      if (file.exists() && file.length() > 0) {
        isValid = true;
      } else {
        isValid = false;
      }
    }
    return isValid;
  }
}
