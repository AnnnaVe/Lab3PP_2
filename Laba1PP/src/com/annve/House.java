package com.annve;

import java.util.ArrayList;

public class House {

  private int countOfStair;
  private int countOfFlatONStair;
  private ArrayList<Flat> flats;

  public House() {
  }

  public House(int countOfStair, int countOfFlatONStair, ArrayList<Flat> flats) {
    this.countOfStair = countOfStair;
    this.countOfFlatONStair = countOfFlatONStair;
    this.flats = flats;
  }

  public int getCountOfStair() {
    return countOfStair;
  }

  public void setCountOfStair(int countOfStair) {
    this.countOfStair = countOfStair;
  }

  public int getCountOfFlatONStair() {
    return countOfFlatONStair;
  }

  public void setCountOfFlatONStair(int countOfFlatONStair) {
    this.countOfFlatONStair = countOfFlatONStair;
  }

  public ArrayList<Flat> getFlats() {
    return flats;
  }

  public void setFlats(ArrayList<Flat> flats) {
    this.flats = flats;
  }

  public double valueOfHouse() {
    double valueOfHouse = 0;

    for (int i = 0; i < flats.size(); i++) {
      valueOfHouse += flats.get(i).valueOfFlat();
    }
    return valueOfHouse;
  }

  public double paintForHouse(){
    double value = 0;
    for (int i = 0; i < flats.size(); i++) {
      value += flats.get(i).paintForFlat();
    }
    return value;
  }
  public void currentPaintForHouse(){
    for (int i = 0; i < flats.size(); i++) {
      for (int j = 0; j < flats.get(i).getRooms().size(); j++) {
        System.out.print(flats.get(i).getRooms().get(j).getPaint().getColor() + " - краски нужно в " + (i+1) + " квартиру " + (j+1) + " комнату: ");
        System.out.print(flats.get(i).getRooms().get(j).countOfPaint() + " л.\n");
      }
    }
  }

  public double parquetForHouse() {
    double value = 0;
    for (int i = 0; i < flats.size(); i++) {
      value += flats.get(i).parquetForFlat();
    }
    return value;
  }

  public double glassForHouse() {
    double value = 0;
    for (int i = 0; i < flats.size(); i++) {
      value += flats.get(i).glassForFlat() * countOfFlatONStair * countOfStair;
    }
    return value;
  }

  public double squareOfHouse() {
    double square = 0;
    for (int i = 0; i < flats.size(); i++) {
      square += flats.get(i).squareOfFlat();
    }
    return square;
  }

  @Override
  public String toString() {
    return "\nHouse{" +
        "countOfStair=" + countOfStair +
        ", countOfFlatONStair=" + countOfFlatONStair +
        ", flats=" + flats +
        '}';
  }
}
