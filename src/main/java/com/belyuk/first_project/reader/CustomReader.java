package com.belyuk.first_project.reader;

import com.belyuk.first_project.exception.SomeException;
import java.util.List;

public interface CustomReader {
  List<String> readFile(String filePath) throws SomeException;
}
