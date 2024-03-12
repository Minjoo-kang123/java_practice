package Shape;

public class Triangle extends Shape{

    private double width;
    private double height;

    public Triangle() {
    }

    public Triangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height / 2;
    }

    @Override
    public double Circume() {
        return Math.sqrt(Math.pow(this.width,2) + Math.pow(this.height,2)) + this.width + this.height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
