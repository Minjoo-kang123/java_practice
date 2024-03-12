package Shape;

public class Circle extends Shape{

    private double radios;

    public Circle() {
    }

    public Circle(int x, int y, double radios) {
        super(x, y);
        this.radios = radios;
    }

    public double getRadios() {
        return radios;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radios,2) * 3.14;
    }

    @Override
    public double Circume() {
        return this.radios * 2 * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radios=" + radios +
                ", x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
