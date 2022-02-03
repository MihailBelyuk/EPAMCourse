package com.belyuk.first_project.parser.impl;

import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.parser.CustomParser;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomParserImpl implements CustomParser {
  private static final Logger LOGGER = LogManager.getLogger();
  private static final CustomParserImpl customParser =new CustomParserImpl();
  private static final String DELIMITER = "\\s+";

  private CustomParserImpl() {}

  public static CustomParserImpl getInstance() {
       return customParser;
  }

  @Override
  public int[] parseString(String stringFromFile) throws SomeException {
    if ( stringFromFile == null){
      throw new SomeException("Provided string is null.");
    }
    int[] intArray;
    String[] lineArray;
    lineArray= stringFromFile.strip().split(DELIMITER);
    intArray = new int[lineArray.length];
    for (int i = 0; i < lineArray.length; i++) {
      intArray[i] = Integer.parseInt(lineArray[i]);
    }
    return intArray;
  }
}
