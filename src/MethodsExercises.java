import java.util.Scanner;
public class MethodsExercises {

    //    1. BASIC ARITHMETIC
    public static int addition(int num1, int num2) {
        return (num1 + num2);
    }

    public static int subtract(int num1, int num2) {
        if (num1 < num2) {
            return subtract(num2, num1);
        } else {
            return num1 - num2;
        }
    }

    public static int multiplication(int num1, int num2) {
        return (num1 * num2);
    }

    ////    Recursive multiple
//public static int multiplyRecursio(int num1, int num2) {
//    if(num2 == 0){
//
//    }else{
//    return num1 + multiplyRecursion(num1, num2 -1)
//}
    public static int division(int num1, int num2) {
        return (num1 / num2);
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
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


    //    3. Calculate factorial of a number
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 10");
//        long input = factorial.parseLong(sc.nextLine());
        int num = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
//        long input =factorial.parseLong(sc.nextLong());
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
//      if user wants to continue
//            System.out.print("\nDo you want to Continue? (y/n): ");
//            userChoice = sc.next();
//            System.out.println();

        public static void dice() {
            System.out.println("Enter the number of sides for a pair of dice");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
        }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println(addition(7, 3));
        System.out.println(subtract(8, 4));
        System.out.println(multiplication(5, 5));
        System.out.println(division(10, 2));
        System.out.println(remainder(3, 2));
        System.out.println(getInteger(1, 10));
        factorial();
    }
}

