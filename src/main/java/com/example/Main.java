package com.example;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Lord of the Rings");
        myMovie.setYear(2001);
        myMovie.setIncludedInPlan(true);
        myMovie.setDuration(178);

        myMovie.avalia(10);
        myMovie.avalia(9);
        myMovie.avalia(5);
        myMovie.avalia(7);
        myMovie.exibeFichaTecnica();

    }

    public static void breakLine() {
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
    }
}
