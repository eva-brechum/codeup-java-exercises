package util;
import java.util.Scanner;

 public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
            String answer;
            System.out.println("Enter a string here: ");
            answer = this.scanner.next();
            return answer;
        }

        public boolean yesNo(){
            String answer;
            System.out.print("\nDo you want to continue? (y/n): ");
            answer = this.scanner.next();
            return answer.toLowerCase().startsWith("y");
     }
    public static void main(String[] args) {
        Input input= new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
    }
}
