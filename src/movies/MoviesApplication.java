package movies;

import util.Input;

public class MoviesApplication {
    public static void movies(){
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
            int userChoice = in.getInt(0,5);
            switch (userChoice) {
                case 0:
                    System.out.println("Are sure you want to quit?");
                    boolean confirmation = in.yesNo();
                  if(confirmation){
                      System.out.println("Goodbye!");
                      choice = false;
                  }else {
                      System.out.println("Refreshing");
                  }
            }
        }
    }
    public static void main(String[] args) {
    movies();
    }

}
