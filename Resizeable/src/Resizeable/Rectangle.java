package Resizeable;

public class Rectangle extends Shape {
    private double width,height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double Area() {
        return width*height;
    }

    @Override
    public String toString() {
        return null;
    }
    @Override
    public double resize(double percent){
        return Area()* percent;
    }
}
