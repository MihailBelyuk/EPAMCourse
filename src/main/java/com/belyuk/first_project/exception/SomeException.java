package com.belyuk.first_project.exception;

public class SomeException extends Exception {

  public SomeException() {
  }

  public SomeException(String message) {
    super(message);
  }

  public SomeException(String message, Throwable cause) {
    super(message, cause);
  }

  public SomeException(Throwable cause) {
    super(cause);
  }
}
