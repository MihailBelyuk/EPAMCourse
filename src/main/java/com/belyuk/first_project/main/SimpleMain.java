package com.belyuk.first_project.main;

import com.belyuk.first_project.entity.SomeArray;
import com.belyuk.first_project.exception.SomeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleMain {
  private static final Logger logger = LogManager.getLogger();

  public static void main(String[] args) throws SomeException {
 int [] array = {1,3,5};
 SomeArray someArray = new SomeArray(array);
    System.out.println();
  }
}
