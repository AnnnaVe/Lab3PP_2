package com.annve;

public class Paint {

  private String color;
  private double count;

  public Paint(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getCount() {
    return count;
  }

  public void setCount(double count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "\n\t\t\tPaint{" +
        "color=" + color +
        ", count=" + count +
        '}';
  }
}
