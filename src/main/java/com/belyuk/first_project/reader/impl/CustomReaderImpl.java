package com.belyuk.first_project.reader.impl;

import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.reader.CustomReader;
import com.belyuk.first_project.validator.ArrayValidator;
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
  private static final Logger logger = LogManager.getLogger();
  private static final CustomReaderImpl customReader = new CustomReaderImpl();

  private CustomReaderImpl() {}

  public static CustomReader getInstance() {
    return customReader;
  }

  @Override
  public List<String> readFile(String filePath) throws SomeException {
    List<String> linesFromFile = new ArrayList<>();
    ArrayValidator validator = ValidatorImpl.getInstance();
    String informationFromFile;
    if (!validator.validateFileInfo(filePath)) {
      logger.log(Level.ERROR, "File trying to access is empty or null.");
      throw new SomeException("File trying to access is empty or null.");
    }
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
      while ((informationFromFile = bufferedReader.readLine()) != null) {
        if (validator.validateFileInfo(informationFromFile)) {
          linesFromFile.add(informationFromFile);
        }
      }
    } catch (FileNotFoundException e) {
      logger.log(Level.ERROR, "File attempting to read is missing.");
      throw new SomeException("File attempting to read is missing.");
    } catch (IOException e) {
      logger.log(Level.ERROR, "File can't be read." + filePath, e);
      throw new SomeException("File can't be read", e);
    }
    return linesFromFile;
  }
}
