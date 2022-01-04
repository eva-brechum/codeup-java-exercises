import java.util.Scanner;
public class MethodsExercises {

    //    1. BASIC ARITHMETIC
    public static int addition(int num1, int num2) {
        return (num1 + num2);
    }

    public static int subtract(int num1, int num2) {
        return (num1 - num2);
    }

    public static int multiplication(int num1, int num2) {
        return (num1 * num2);
    }

    public static int division(int num1, int num2) {
        return (num1 / num2);
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }


    public static void main(String[] args) {
        System.out.println(addition(7, 3));
        System.out.println(subtract(8, 4));
        System.out.println(multiplication(5, 5));
        System.out.println(division(10, 2));
        System.out.println(remainder(3, 2));
        System.out.println(getInteger(1, 10));
    }


//    BONUS

//    2. Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userInput = Integer.parseInt(sc.nextLine());
        if (userInput < min) {
            System.out.println("your number is out of range");
            return getInteger(min, max);
        } else if (userInput > max) {
            System.out.println(" your number is out of range");
            return getInteger(min, max);
        }
        System.out.println("Good, your number is within the range");
        return userInput;
    }
}