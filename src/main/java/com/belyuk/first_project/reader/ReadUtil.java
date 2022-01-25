package com.belyuk.first_project.reader;

import com.belyuk.first_project.validator.Validator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadUtil {
  private final static File NUMBERS_FILE = new File("data\\numbers.txt");
  static final Logger LOGGER = LogManager.getLogger();
  private String informationFromFile;

  public String readFile() {
    if (Validator.validateFileInfo(NUMBERS_FILE)) {
      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(NUMBERS_FILE))) {
        informationFromFile = bufferedReader.readLine();
      } catch (FileNotFoundException e) {
        LOGGER.log(Level.ERROR, "File attempting to read is missing.", e);
      } catch (IOException e) {
        LOGGER.log(Level.ERROR, e.getMessage());
      }
    }
    return informationFromFile;
  }
}
