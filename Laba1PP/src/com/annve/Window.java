package com.annve;

public class Window {

  private double height;
  private double width;

  public Window(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public double getOfSquare() {
    return height * width;
  }

  public double countOfGlass(){
    return width * height;
  }

  @Override
  public String toString() {
    return "\n\t\t\tWindow{" +
        "height=" + height +
        ", width=" + width +
        '}';
  }
}
