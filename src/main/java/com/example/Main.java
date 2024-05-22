package com.example;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Lord of the Rings");
        myMovie.setYear(2001);
        myMovie.setIncludedInPlan(true);
        myMovie.setDuration(178);
        myMovie.setTotalReviews(10);

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
        lost.setTotalReviews(3);
        lost.setSeasons(10);
        lost.setEpisodes(159);
        lost.setEpisodeDuration(45);
        lost.avalia(8);
        lost.avalia(5);
        lost.avalia(7);
        lost.exibeFichaTecnica();
        System.out.println("Duration: " + lost.getDurationInMinutes());

        breakLine();

        Movie anotherMovie = new Movie();
        anotherMovie.setName("Harry Potter");
        anotherMovie.setYear(2003);
        anotherMovie.setDuration(152);
        anotherMovie.setTotalReviews(7);

        DurationCalculator calculator = new DurationCalculator();
        calculator.addDuration(myMovie);
        calculator.addDuration(lost);
        calculator.addDuration(anotherMovie);
        System.out.println("Total duration: " + calculator.getTotalDuration());

        breakLine();

        ClassificationFilter classificationFilter = new ClassificationFilter();
        classificationFilter.filter(myMovie);
        System.out.println(myMovie.getName() + " classification are: " + classificationFilter.getRecommendation());

        classificationFilter.filter(lost);
        System.out.println(lost.getName() + " classification are: " + classificationFilter.getRecommendation());

        classificationFilter.filter(anotherMovie);
        System.out.println(anotherMovie.getName() + " classification are: " + classificationFilter.getRecommendation());
    }

    public static void breakLine() {
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
    }
}
