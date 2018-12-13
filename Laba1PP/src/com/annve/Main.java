package com.annve;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Parquet parquet1 = new Parquet(10, 10);
    Parquet parquet2 = new Parquet(20, 20);
    Parquet parquet3 = new Parquet(30, 30);

    Window window1 = new Window(2, 1);
    Window window2 = new Window(3, 2);
    Window window3 = new Window(2, 2);

    Paint paint1 = new Paint("жёлтая");
    Paint paint2 = new Paint("зелёная");
    Paint paint3 = new Paint("синяя");

    Room room1 = new Room(4, 3, 3, paint1, window1, parquet1);
    Room room2 = new Room(5, 4, 3, paint2, window2, parquet2);
    Room room3 = new Room(6, 5, 3, paint3, window3, parquet3);

    Room room21 = new Room(6, 3, 3, paint1, window1, parquet1);
    Room room22 = new Room(4, 5, 3, paint2, window2, parquet2);
    Room room23 = new Room(4, 4, 3, paint3, window3, parquet3);

    Room room31 = new Room(2, 1, 4, paint2, window2, parquet2);
    Room room32 = new Room(6, 7, 4, paint1, window1, parquet1);
    Room room33 = new Room(8, 8, 4, paint3, window3, parquet3);
    Room room34 = new Room(7, 9, 4, paint1, window2, parquet1);

    Room room41 = new Room(6, 3, 5, paint2, window1, parquet3);
    Room room42 = new Room(8, 5, 5, paint1, window2, parquet1);

    Room room51 = new Room(10, 9, 5, paint3, window3, parquet1);
    Room room52 = new Room(11, 10, 5, paint2, window1, parquet2);

    ArrayList<Room> rooms1 = new ArrayList<>();
    rooms1.add(room1);
    rooms1.add(room2);
    rooms1.add(room3);

    ArrayList<Room> rooms2 = new ArrayList<>();
    rooms2.add(room21);
    rooms2.add(room22);
    rooms2.add(room23);

    ArrayList<Room> rooms3 = new ArrayList<>();
    rooms3.add(room31);
    rooms3.add(room32);
    rooms3.add(room33);
    rooms3.add(room34);

    ArrayList<Room> rooms4 = new ArrayList<>();
    rooms4.add(room41);
    rooms4.add(room42);

    ArrayList<Room> rooms5 = new ArrayList<>();
    rooms5.add(room51);
    rooms5.add(room52);

    Flat flat1 = new Flat(3, rooms1);
    Flat flat2 = new Flat(3, rooms2);
    Flat flat3 = new Flat(4, rooms3);
    Flat flat4 = new Flat(2, rooms4);
    Flat flat5 = new Flat(2, rooms5);

    ArrayList<Flat> flats1 = new ArrayList<>();
    flats1.add(flat1);
    flats1.add(flat2);

    ArrayList<Flat> flats2 = new ArrayList<>();
    flats2.add(flat3);
    flats2.add(flat4);
    flats2.add(flat5);

    House house1 = new House(1, 2, flats1);
    House house2 = new House(1, 2, flats2);

    System.out.println(house1);
    System.out.println("Общая площадь квартир в доме: " + house1.squareOfHouse() + " кв.м.");
    System.out.println("Количество краски, которое нужно для дома: " + house1.paintForHouse() + " л.");
    house1.currentPaintForHouse();
    System.out.println("Количество паркета, которое нужно для дома: " + house1.parquetForHouse() + " кв.м.");
    System.out.println("Количество стекла, нужное для окон в домее: " + house1.glassForHouse() + "кв.м.");

    System.out.println();

    System.out.println(house2);
    System.out.println("Общая площадь квартир в доме: " + house2.squareOfHouse() + " кв.м.");
    System.out.println("Количество краски, которое нужно для дома: " + house2.paintForHouse() + " л.");
    house2.currentPaintForHouse();
    System.out.println("Количество паркета, которое нужно для дома: " + house2.parquetForHouse() + " кв.м.");
    System.out.println("Количество стекла, нужное для окон в домее: " + house2.glassForHouse() + " кв.м.");
  }
}
