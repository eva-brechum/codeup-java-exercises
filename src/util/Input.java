package util;
import java.util.Scanner;

 public class Input {
     Scanner scanner = new Scanner (System.in);
     private Scanner sc;
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
         try{
             return Integer.valueOf(getString());
         }catch(NumberFormatException e){
             System.out.println("you entered %d,userInput");
             return getInt();
         }
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
         try {
             return Double.valueOf(getString());
         } catch (NumberFormatException e) {
             System.out.println("Enter a decimal number");
             System.out.println(e.getMessage());
             return getDouble();
         }
     }
     public double getDouble(String prompt) {
         System.out.println(prompt);
         try {
             return Double.valueOf(getString());
         } catch (NumberFormatException e) {
             System.out.println("Invalid input enter a number");
             System.out.println(e.getMessage());
             return  getDouble();
         }
     }
 }