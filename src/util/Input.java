package util;
import java.util.Scanner;

 class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
//    public String getString() {
//        return getString("Enter a string: ");

        public String getString(){
            String answer;
            System.out.println("Enter a string here: ");
            answer = this.scanner.next();
            return answer;
        }
    public static void main(String[] args) {
        Input input= new Input();
        System.out.println(input.getString());
    }
}
