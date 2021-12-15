import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        #1
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %f", pi);

//        EXPLORING SCANNER CLASS
//        #1
        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Please enter an integer");
//        int a;
//        a = scanner.nextInt();
//        System.out.println("You have entered integer " + a);
//        if not an integer (Exception in thread main java.util)

//        #2
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 words");
//        String text = "words";
        String text1= scanner.nextLine();
        String text2 =scanner.nextLine();
        String text3= scanner.nextLine();
        System.out.println("You wrote "+ text1  + text2 + text3);

//        #3
        System.out.println("Enter a sentence");
//        String sentence = scanner.next();
//        System.out.println(sentence);
//        no it does not capture all the words because
//         this method cannot read words with spaces in it
        String sentence = scanner.nextLine();
        System.out.println(sentence);

//        Calculate the perimeter
        System.out.println("Enter length and width of your room");
        String length = scanner.nextLine();
        System.out.println("The length of your room is " + length);
        String width = scanner.nextLine();
        System.out.println("The width of your room is " + width);
    }
}
