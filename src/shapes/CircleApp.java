package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void createCircle() {
        Input input = new Input();
        int count = 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Input input = new Input();
        System.out.println("Whats the radius of a circle");
        double radius = sc.nextDouble();
        Circle c1 = new Circle(radius);
        System.out.printf("Area of circle is %f%n", c1.getArea());
        System.out.printf("Circle circumference is %f%n", c1.getCircumference());
    }
}
