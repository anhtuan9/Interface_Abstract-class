package Resizeable;

public abstract class Shape implements Resizeable {
    private String name, color;

    public Shape() {
        this.name = "null";
        this.color = "null";
    }
    abstract public double Area();

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String toString();

    @Override
    public double resize(double percent) {
        return 0;
    }
}
