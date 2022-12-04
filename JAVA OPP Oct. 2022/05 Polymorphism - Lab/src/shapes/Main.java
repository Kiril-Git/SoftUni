package shapes;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(4.0, 5.0);

        Shape ovalShape = new Circle(5.0);

        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        System.out.println(ovalShape.calculateArea());
        System.out.println(ovalShape.calculatePerimeter());
    }
}
