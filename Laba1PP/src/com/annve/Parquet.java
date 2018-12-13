package com.annve;

public class Parquet {

  private double length;
  private double width;

  public Parquet(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public double squareParquet(){
    return getLength() * getWidth();
  }

  @Override
  public String toString() {
    return "\n\t\t\tParquet{" +
        "length=" + length +
        ", width=" + width +
        '}';
  }
}
