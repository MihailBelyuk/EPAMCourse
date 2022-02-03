package com.belyuk.first_project.entity;

public class ArrayStatistics {
  private int min;
  private int max;
  private double average;
  private int sum;
  private int positiveValues;
  private int negativeValues;

  public ArrayStatistics(
      int min, int max, double average, int sum, int positiveValues, int negativeValues) {
    this.min = min;
    this.max = max;
    this.average = average;
    this.sum = sum;
    this.positiveValues = positiveValues;
    this.negativeValues = negativeValues;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public int getMax() {
    return max;
  }

  public void setMax(int max) {
    this.max = max;
  }

  public double getAverage() {
    return average;
  }

  public void setAverage(double average) {
    this.average = average;
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }

  public int getPositiveValues() {
    return positiveValues;
  }

  public void setPositiveValues(int positiveValues) {
    this.positiveValues = positiveValues;
  }

  public int getNegativeValues() {
    return negativeValues;
  }

  public void setNegativeValues(int negativeValues) {
    this.negativeValues = negativeValues;
  }
}
