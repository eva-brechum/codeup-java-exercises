
import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        int max =100;
        int min = 1;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = min + random.nextInt(max);
//        String userInput;
        System.out.println("Guess a random number between 1-100");
        int userInput = Integer.parseInt(sc.next());
//        userInput = sc.next();
        if (userInput < num) {
            System.out.println("HIGHER!");
        } else if(userInput > num) {
            System.out.println("LOWER!");
        } else {
            System.out.println("GOOD GUESS");
        }

    }
}
