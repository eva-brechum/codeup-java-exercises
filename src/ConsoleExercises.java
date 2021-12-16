import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        #1
        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %f", pi);
//        Or
        System.out.printf("\n The value of pi is approximately %.2f. \n", pi);

//        EXPLORING SCANNER CLASS
//        #1
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter an integer");
        int a;
        a = scanner.nextInt();
        System.out.println("You have entered integer " + a);
//        if not an integer (Exception in thread main java.util)

//        #2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 3 words");
////        String text = "words";
//        String text1= scanner.next();
//        String text2 =scanner.next();
//        String text3= scanner.next();
//        System.out.println("You wrote "+ text1  + text2 + text3);

//        #3
//        System.out.println("Enter a sentence");
//        String sentence = scanner.next();
//        System.out.println(sentence);
//        no it does not capture all the words because
//         this method cannot read words with spaces in it
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

//        CALCULATE THE PERIMETER
//        P= 2(l+w);
//        #1
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter width of your room: ");
//        int width = in.nextInt();
//        int length = in.nextInt();
//        System.out.println("Area is: " + width * length);
//
//        System.out.println("Enter the width and height: ");
//        String input = scanner.nextLine();


//        #2
        float length, width, area, perimeter;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
       length = in.nextFloat();

       System.out.print("Enter the width of the rectangle: ");
       width = in.nextFloat();

       perimeter = 2 * (length + width);

       area = length * width;
       System.out.println("Perimeter of rectangle " + perimeter + " units. ");
       System.out.println("Area of rectangle is " + area + " sq. units. ");
        System.out.println("The length of your room is " + length);
//        String width = scanner.nextLine();
        System.out.println("The width of your room is " + width);
    }
}
