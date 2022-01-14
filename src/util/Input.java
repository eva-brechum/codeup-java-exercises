package util;
import java.util.Scanner;

 public class Input {
     private Scanner scanner;

     public Input() {
         this.scanner = new Scanner(System.in);
     }

     public String getString() {
         String answer;
         System.out.println("Enter an input here: ");
         answer = this.scanner.next();
         return answer;
     }

//     public String getString(String prompt)

     public boolean yesNo() {
         String answer;
         System.out.print("\nDo you want to continue? (y/n): ");
         answer = this.scanner.next();
         return answer.toLowerCase().startsWith("y");
     }

     public int getInt(int min, int max) {
         System.out.printf("Enter an integer");
         int userInput = scanner.nextInt();
         if (userInput > max || userInput < min) {
             return getInt(min, max);
         }
         return userInput;
     }

     public int getInt() {
         System.out.println("Enter a number");
         int userInput = scanner.nextInt();
         System.out.printf("you entered %d,userInput");
         return userInput;
     }

     public double getDouble(double min, double max) {
         System.out.println("Enter a decimal number");
         double userInput = scanner.nextDouble();
         if (userInput > max || userInput < min) {
             return getDouble(min, max);
         }
         return userInput;
     }

     public double getDouble() {
         System.out.println("Enter a decimal number");
         double userInput = scanner.nextDouble();
         System.out.println("you entered:%d, userInput");
         return userInput;
     }
 }