package com.belyuk.first_project.observer;

import com.belyuk.first_project.entity.AbstractArray;
import com.belyuk.first_project.entity.SomeArray;
import java.util.EventObject;

public class ArrayEvent extends EventObject {

  /**
   * Constructs a prototypical Event.
   *
   * @param source the object on which the Event initially occurred
   * @throws IllegalArgumentException if source is null
   */
  public ArrayEvent(Object source) {
    super(source);
  }

  @Override
  public AbstractArray getSource() {
    return (AbstractArray) super.getSource();
  }
}
