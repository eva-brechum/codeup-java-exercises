package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
    public double getWidth() {
        return this.width;
    }
        public double getLength(){
        return this.length;
    }
    public abstract double setWidth();
    public abstract double setLength();
}
