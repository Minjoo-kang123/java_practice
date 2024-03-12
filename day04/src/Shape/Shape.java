package Shape;

public abstract class Shape {

    protected int x;
    protected int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double Circume();

    public void left(int x){
        this.x += x;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
