package shapes;
public class Square extends Quadrilateral{
    protected int side;
    public Square(int side) {

        super(side,side);
        this.side = side;
    }
    public double setLength() {
        return side;
    }

    public double setWidth() {
        return side;
    }

}


//
//public class Square extends Rectangle {
//protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea() {
//        return (side * side);
//    }
//
//    public int getPerimeter() {
//        return (4 * side);
//    }
//}
