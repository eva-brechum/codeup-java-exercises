package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
protected double length;
    protected double width;
    public Rectangle(double length, double width){
        super(length,width);
    }
    public double setWidth(){
         return width;
    }
    public double setLength() {
        return length;
    }

}
//public class Rectangle {
//    protected int length;
//    protected int width;
//
//    public Rectangle (int length, int width) {
//        this.length = length;
//        this.width= width;
//    }
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return (2* length) + (2 * width);
//    }
//     }
