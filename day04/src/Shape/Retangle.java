package Shape;

public class Retangle extends Shape{

    private double width;
    private double height;

    public Retangle() {
    }

    public Retangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double Circume() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
