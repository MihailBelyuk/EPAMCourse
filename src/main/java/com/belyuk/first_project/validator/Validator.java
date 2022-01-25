package com.belyuk.first_project.validator;

import com.belyuk.first_project.parser.CustomParser;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Validator {
  private static final String FILE_INFO_VALIDATOR = "\\d+,\\s+";
  static final Logger LOGGER = LogManager.getLogger();

  public static boolean validateFileInfo(File numbers) {
    if (numbers.exists() && numbers.length() > 0) {
      return true;
    } else {
      LOGGER.log(Level.ERROR, "File doesn't meet the requirements.");
    }
    return false;
  }

  public boolean validateLine(CustomParser stringParser) { //TODO Apply to parser
    List<String> list;
    list = Arrays.asList(stringParser.getLiteralsFromFile());
    for (String str : list) {
      if (str.matches(FILE_INFO_VALIDATOR)) {
        return true;
      }
    }
    LOGGER.log(Level.ERROR, "Invalid literals in the file");
    return false;
  }
}
