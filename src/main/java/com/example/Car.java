package com.example;

import java.util.Calendar;
import java.util.Date;

public class Car {
  protected String brand;
  protected int year;
  protected String color;

  public Car(String brand, int year, String color) {
    this.brand = brand;
    this.year = year;
    this.color = color;
  }

  protected int calculateYears(int currentYear) {
    return currentYear - this.year;
  }

  public void show() {
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    System.out.println("Brand: " + this.brand);
    System.out.println("Year: " + this.year);
    System.out.println("Years: " + this.calculateYears(currentYear) + " (" + this.year + ")");
    System.out.println("Color: " + this.color);
  }
}
