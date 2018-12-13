package com.annve;

public class Room {

  private int length;
  private int width;
  private int height;
  private Paint paint;
  private Window window;
  private Parquet parquet;

  public Room() {
  }

  public Room(int length, int width, int height, Paint paint, Window window, Parquet parquet) {
    this.length = length;
    this.width = width;
    this.height = height;
    this.paint = paint;
    this.window = window;
    this.parquet = parquet;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public Paint getPaint() {
    return paint;
  }

  public void setPaint(Paint paint) {
    this.paint = paint;
  }

  public Window getWindow() {
    return window;
  }

  public void setWindow(Window window) {
    this.window = window;
  }

  public Parquet getParquet() {
    return parquet;
  }

  public void setParquet(Parquet parquet) {
    this.parquet = parquet;
  }

  public double squareMWindow() {
    return window.getOfSquare();
  }

  public double squareOfRoom() {
    return length * height;
  }

  public double volumeOfRoom() {
    return length * height * width;
  }

  public double countOfParquet() {
    return width * length;
  }

  public double countOfGlass() {
    return window.countOfGlass();
  }

  public double countOfPaint() {
    paint.setCount((height * length) + (height * width) / 10);
    return paint.getCount();
  }

  @Override
  public String toString() {
    return "\n\t\tRoom{" +
        "length=" + length +
        ", width=" + width +
        ", height=" + height +
        ", paint=" + paint +
        ", window=" + window +
        ", parquet=" + parquet +
        '}';
  }
}
