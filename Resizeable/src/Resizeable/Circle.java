package Resizeable;

public class Circle extends Shape {
    private double n;

    public Circle() {
        this.n = 0;
    }

    public Circle(String name, String color, double n) {
        super(name, color);
        this.n = n;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    @Override
    public double Area() {
        return n * n * Math.PI;
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
