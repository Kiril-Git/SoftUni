package box;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    private void setLength() {
        this.length = length;
    }

    public double getWidth() {
        if (width <= 0){
            
        }

        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }
    public Double calculateSurfaceArea(Double length, Double width, Double height){

        return 2 * length * width + 2 * length * height + 2 * width * height;
    }



}
