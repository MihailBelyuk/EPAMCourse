package com.belyuk.first_project.main;

import com.belyuk.first_project.entity.IdGenerator;
import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;
import com.belyuk.first_project.parser.impl.CustomParserImpl;
import com.belyuk.first_project.reader.Reader;
import com.belyuk.first_project.reader.impl.ReaderImpl;
import com.belyuk.first_project.service.impl.ServiceUtilImpl;
import com.belyuk.first_project.sort.impl.SortingUtilImpl;
import java.util.Arrays;
import javax.swing.text.html.parser.Parser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleMain {
  private static final Logger LOGGER = LogManager.getLogger();

  public static void main(String[] args) throws SomeException {
    Reader reader = ReaderImpl.getInstance();

    SomeArray someArray = new SomeArray(CustomParserImpl.getInstance().parseString(reader.readFile().get(0)));

    ServiceUtilImpl serviceUtils = new ServiceUtilImpl();
    SortingUtilImpl sortingUtil = new SortingUtilImpl();


    System.out.println(Arrays.toString(someArray.getArray()));
//
//    LOGGER.log(Level.INFO, Arrays.toString(serviceUtils.replace(someArray)));
//    LOGGER.log(Level.INFO, Arrays.toString(sortingUtil.sortByBubble(someArray)));
//    LOGGER.log(Level.INFO, Arrays.toString(sortingUtil.sortByInsertion(someArray)));
//    LOGGER.log(Level.INFO, Arrays.toString(sortingUtil.sortBySelection(someArray)));
//    LOGGER.log(Level.INFO, Arrays.toString(sortingUtil.sortUsingIntStream(someArray)));
  }
}
