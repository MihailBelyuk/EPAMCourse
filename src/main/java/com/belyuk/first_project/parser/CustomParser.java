package com.belyuk.first_project.parser;

import com.belyuk.first_project.exception.SomeException;

public interface CustomParser {
  int[] parseString(String stringFromFile) throws SomeException;
}
