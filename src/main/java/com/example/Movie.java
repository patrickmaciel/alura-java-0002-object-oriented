package com.example;

public class Movie {
    String name;
    int year;
    boolean includedInPlan;
    double review;
    double sumRates;
    int totalReviews;
    int duration;

    void exibeFichaTecnica() {
        System.out.println("Movie: " + name);
        System.out.println("Year: " + year);
        System.out.println("Included in plan: " + includedInPlan);
        System.out.println("Review: " + review);
        System.out.println("Sum Rate: " + sumRates);
        System.out.println("Rate: " + getAverageRate());
        System.out.println("Total reviews: " + totalReviews);
        System.out.println("Duration: " + duration);
    }

    void avalia (double rate) {
        totalReviews++;
        sumRates += rate;
    }

    double getAverageRate() {
        return sumRates / totalReviews;
    }
}
