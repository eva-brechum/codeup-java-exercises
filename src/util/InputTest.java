package util;

public class InputTest {
    public static void main(String[] args) {
        Input input= new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        input.getInt(1, 10);
        input.getDouble(2.5, 10.5);
        input.getInt();
        input.getDouble();
    }
}
