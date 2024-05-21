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

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        Music music = new Music("Bohemian Rhapsody", "Queen", 1975);
        music.show();

        breakLine();

        Person person = new Person("John", 30, 1.75, 85);
        person.show();

        breakLine();

        Car car = new Car("Fiat", 2019, "Red");
        car.show();

        breakLine();

        Student student = new Student("Alice", 20);
        student.show();
    }

    public static void breakLine() {
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
    }
}
