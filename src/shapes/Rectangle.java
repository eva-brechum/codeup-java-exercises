package shapes;


public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle (int lengthNum, int widthNum) {
        this.length = lengthNum;
        this.width= widthNum;
    }
    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2* length + 2 * width;
    }
     }
