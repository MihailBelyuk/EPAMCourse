package com.belyuk.first_project.reader;

import com.belyuk.first_project.exception.SomeException;
import java.util.List;

public interface Reader {
List<String> readFile() throws SomeException;
}
