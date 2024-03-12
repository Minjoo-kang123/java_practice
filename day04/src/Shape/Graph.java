package Shape;

public class Graph {

    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Retangle(10,10,20,20);
        shapes[1] = new Triangle(10,10,20,20);
        shapes[2] = new Circle(10,10,20);

        for(Shape s : shapes){
            System.out.println(s.getArea());
            if(s instanceof Circle){
                Circle c = (Circle) s;
                System.out.println(c.getRadios());
            }
        }
    }
}
