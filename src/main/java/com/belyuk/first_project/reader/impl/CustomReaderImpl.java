package com.belyuk.first_project.reader.impl;

import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.reader.CustomReader;
import com.belyuk.first_project.validator.Validator;
import com.belyuk.first_project.validator.impl.ValidatorImpl;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomReaderImpl implements CustomReader {
  private static final Logger LOGGER = LogManager.getLogger();
  private static final CustomReaderImpl customReader = new CustomReaderImpl();
  private static final String FILE_INFO_VALIDATOR = "^\\s*-?\\d{1,10}(\\s+(-?\\d{1,10}))*\\s*$";

  private CustomReaderImpl() {}

  public static CustomReader getInstance() {
    return customReader;
  }

  @Override
  public List<String> readFile(String filePath) throws SomeException {
    if (filePath == null) {
      LOGGER.log(Level.ERROR, "File path is null.");
      throw new SomeException("File path is null.");
    }
    List<String> lines = new ArrayList<>();
    Validator validator = ValidatorImpl.getInstance();
    String informationFromFile;
    if (validator.validateFileInfo(filePath)) {
      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
        while ((informationFromFile = bufferedReader.readLine()) != null) {
          if (informationFromFile.matches(FILE_INFO_VALIDATOR)) {
            lines.add(informationFromFile);
          }
        }
      } catch (FileNotFoundException e) {
        LOGGER.log(Level.ERROR, "File attempting to read is missing.");
        throw new SomeException("File attempting to read is missing.");
      } catch (IOException e) {
        LOGGER.log(Level.ERROR, e.getMessage());
      }
    } else {
      LOGGER.log(Level.ERROR, "File trying to access is empty.");
      throw new SomeException("File trying to access is empty.");
    }
    return lines;
  }
}
