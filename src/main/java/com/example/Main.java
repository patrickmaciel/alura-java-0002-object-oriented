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

        breakLine();

        Serie lost = new Serie();
        lost.setName("LOST");
        lost.setYear(1999);
        lost.setIncludedInPlan(true);
        lost.setSeasons(10);
        lost.setEpisodes(159);
        lost.setEpisodeDuration(45);
        lost.avalia(8);
        lost.avalia(5);
        lost.avalia(7);
        lost.exibeFichaTecnica();
        System.out.println("Duration: " + lost.getDurationInMinutes());
    }

    public static void breakLine() {
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
    }
}
