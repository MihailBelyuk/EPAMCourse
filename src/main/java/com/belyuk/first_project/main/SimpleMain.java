package com.belyuk.first_project.main;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.parser.CustomParser;
import com.belyuk.first_project.reader.ReadUtil;
import com.belyuk.first_project.service.impl.ServiceUtilImpl;
import com.belyuk.first_project.service.impl.ServiceUtiIImplStream;
import com.belyuk.first_project.sort.impl.SortingUtilImpl;
import com.belyuk.first_project.validator.Validator;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleMain {
  private static final Logger log = LogManager.getLogger();

  public static void main(String[] args) {

    CustomParser stringParser = new CustomParser();
    ReadUtil readUtil = new ReadUtil();
    SomeArray someArray = new SomeArray();

    Validator validator = new Validator();
    // someArray.setArray(parser.parse());
    ServiceUtilImpl serviceUtils = new ServiceUtilImpl();
    ServiceUtiIImplStream serviceUtilsImplStream = new ServiceUtiIImplStream();
    SortingUtilImpl sortingUtil = new SortingUtilImpl();

//    sortingUtil.sortBubble(parser.parse());
int[] num = new int[]{1,5,5,6,6,7};
    // sortingUtil.sortSelection(parser.parse());
    //  sortingUtil.sortInsert(parser.parse());
    someArray.setArray(stringParser.parseString(readUtil,validator));

   System.out.println(Arrays.toString(serviceUtils.replace(someArray.getArray())));

    System.out.println(Arrays.toString( sortingUtil.sortByBubble(someArray.getArray())));
    System.out.println(Arrays.toString( sortingUtil.sortByInsertion(someArray.getArray())));
    System.out.println(Arrays.toString( sortingUtil.sortBySelection(someArray.getArray())));
    System.out.println(Arrays.toString( sortingUtil.sortUsingIntStream(someArray.getArray())));


  }
}
