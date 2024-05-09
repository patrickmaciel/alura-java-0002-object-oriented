package com.example;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The Lord of the Rings";
        myMovie.year = 2001;
        myMovie.includedInPlan = true;
        myMovie.duration = 178;

        myMovie.avalia(10);
        myMovie.avalia(9);
        myMovie.avalia(5);
        myMovie.avalia(7);
        myMovie.exibeFichaTecnica();
    }
}
