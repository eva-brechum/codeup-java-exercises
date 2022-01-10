package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
        this.length = this.length;
        this.width = this.width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

}
