package com.belyuk.first_project.parser;

import com.belyuk.first_project.reader.ReadUtil;

public class CustomParser {
  private static final String DELIMITER = "\\s+";
  private String fileData;
  private String[] literalsFromFile;

  public int[] parseString(ReadUtil readUtil) {
    int[] intArray;
    fileData = readUtil.readFile();
    literalsFromFile = fileData.split(DELIMITER);
    intArray = new int[literalsFromFile.length];
    for (int i = 0; i < literalsFromFile.length; i++) {
      intArray[i] = Integer.parseInt(literalsFromFile[i]);
    }
    return intArray;
  }

  public String[] getLiteralsFromFile() {
    return literalsFromFile;
  }
}
