package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(){
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

}
