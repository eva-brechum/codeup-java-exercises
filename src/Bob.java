import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String input = sc.nextLine();
    if(input.endsWith("?")){
        System.out.println("Sure.");
    }else if (input.endsWith("!")){
        System.out.println("Whoa, chill out!");
    }else if(input.isEmpty()){
        System.out.println("Fine. Be that way!");
    }else{
        System.out.println("Whatever.");
    }
        System.out.println("Do you want to continue talking? [y/N] ");
    String answer = sc.nextLine();
    if(answer.equals("N")) {
        System.out.println("Ok! BYE THEN!");
    }
    }
}
