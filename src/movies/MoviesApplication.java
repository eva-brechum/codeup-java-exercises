package movies;

import util.Input;

public class MoviesApplication {
    public static void movies() {
        boolean choice = true;
        Movie[] movieArray = MoviesArray.findAll();
        Input in = new Input();
        while (choice) {
            System.out.println("What would you like to do?");
            System.out.println("0-exit");
            System.out.println("1- view all movies");
            System.out.println("2- view movies in the animated category");
            System.out.println("3- view movies in the drama category");
            System.out.println("4- view movies in the horror category");
            int userChoice = in.getInt(0, 5);
            switch (userChoice) {
                case 0:
                    System.out.println("Are sure you want to quit?");
                    boolean confirmation = in.yesNo();
                    if (confirmation) {
                        System.out.println("Goodbye!");
                        choice = false;
                    } else {
                        System.out.println("Refreshing list...");
                    }
                    break;
                case 1:
                    for (Movie movie : movieArray) {
                        System.out.println(movie.getName() + "-" + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                case 5:
                    for (Movie movie : movieArray) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                    break;
            }
        }
    }
        public static void main(String[] args){
            movies();
        }
    }
