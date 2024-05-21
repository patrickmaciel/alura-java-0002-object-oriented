package com.example;

public class Music {
  protected String title;
  protected String artist;
  protected int releaseYear;

  public Music(String title, String artist, int releaseYear) {
    this.title = title;
    this.artist = artist;
    this.releaseYear = releaseYear;
  }

  public void show() {
    System.out.println("Title: " + this.title);
    System.out.println("Artist: " + this.artist);
    System.out.println("Release Year: " + this.releaseYear);
  }

}
