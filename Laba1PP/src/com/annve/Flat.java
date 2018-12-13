package com.annve;

import java.util.ArrayList;

public class Flat {

  private int countOfRoom;
  private ArrayList<Room> rooms;

  public Flat() {
  }

  public Flat(int countOfRoom, ArrayList<Room> rooms) {
    this.countOfRoom = countOfRoom;
    this.rooms = rooms;
  }

  public int getCountOfRoom() {
    return countOfRoom;
  }

  public void setCountOfRoom(int countOfRoom) {
    this.countOfRoom = countOfRoom;
  }

  public ArrayList<Room> getRooms() {
    return rooms;
  }

  public void setRooms(ArrayList<Room> rooms) {
    this.rooms = rooms;
  }

  public double paintForFlat() {
    double countOfPaintForFlat = 0;
    for (int i = 0; i < rooms.size(); i++) {
      countOfPaintForFlat += rooms.get(i).countOfPaint();
    }
    return countOfPaintForFlat;
  }

  public double squareOfFlat() {
    double square = 0;
    for (int i = 0; i < rooms.size(); i++) {
      square += rooms.get(i).squareOfRoom();
    }
    return square;
  }

  public double parquetForFlat() {
    double countOfParquetForFlat = 0;
    for (int i = 0; i < rooms.size(); i++) {
      countOfParquetForFlat += rooms.get(i).countOfParquet();
    }
    return countOfParquetForFlat;
  }

  public double glassForFlat() {
    double countOfGlassForFlat = 0;
    for (int i = 0; i < rooms.size(); i++) {
      countOfGlassForFlat += rooms.get(i).countOfGlass() * countOfRoom;
    }
    return countOfGlassForFlat;
  }

  public double valueOfFlat() {
    double value = 0;
    for (int i = 0; i < rooms.size(); i++) {
      value += rooms.get(i).squareOfRoom();
    }
    return value;
  }

  @Override
  public String toString() {
    return "\n\tFlat{" +
        "countOfRoom=" + countOfRoom +
        ", rooms=" + rooms +
        '}';
  }
}
