package com.example;

public class Student {
  protected String name;
  protected int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void show() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
  }
}
