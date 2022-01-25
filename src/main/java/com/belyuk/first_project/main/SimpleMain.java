package com.belyuk.first_project.main;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.parser.CustomParser;
import com.belyuk.first_project.reader.ReadUtil;
import com.belyuk.first_project.service.impl.ServiceUtilImpl;
import com.belyuk.first_project.sort.impl.SortingUtilImpl;
import com.belyuk.first_project.validator.Validator;
import java.util.Arrays;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleMain {
  private static final Logger LOGGER = LogManager.getLogger();

  public static void main(String[] args) {

    CustomParser stringParser = new CustomParser();
    ReadUtil readUtil = new ReadUtil();
    SomeArray someArray = new SomeArray();
    Validator validator = new Validator();
    ServiceUtilImpl serviceUtils = new ServiceUtilImpl();
    SortingUtilImpl sortingUtil = new SortingUtilImpl();

    someArray.setArray(stringParser.parseString(readUtil, validator));

    LOGGER.log(Level.INFO, Arrays.toString(serviceUtils.replace(someArray.getArray())));
    LOGGER.log(Level.INFO, Arrays.toString(sortingUtil.sortByBubble(someArray.getArray())));
    LOGGER.log(Level.INFO, Arrays.toString(sortingUtil.sortByInsertion(someArray.getArray())));
    LOGGER.log(Level.INFO, Arrays.toString(sortingUtil.sortBySelection(someArray.getArray())));
    LOGGER.log(Level.INFO, Arrays.toString(sortingUtil.sortUsingIntStream(someArray.getArray())));


  }
}
