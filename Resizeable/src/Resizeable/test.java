package Resizeable;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle("circle","color",12);
        Rectangle rectangle = new Rectangle("rectangle","color",12,12);
        ManagerShape managerShape = new ManagerShape();
        managerShape.add(circle);
        managerShape.add(rectangle);
        managerShape.displayBefor();
        managerShape.displayAfter();
    }
}
