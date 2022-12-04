package shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        super.setPerimeter(Math.PI * 2 * radius);
        return super.getPerimeter();
    }

    @Override
    public double calculateArea() {
        super.setArea(Math.PI * Math.pow(radius, 2));
        return super.getArea();
    }

    public final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
