package Resizeable;

import java.util.ArrayList;
import java.util.Random;

public class ManagerShape {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ManagerShape(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ManagerShape(){
    }
    public void add(Shape shape){
        shapes.add(shape);
    }
    public void displayBefor(){
        for (int i = 0 ; i < shapes.size();i++){
            System.out.println("Shape" + shapes.get(i).getName());
            System.out.println(shapes.get(i).Area());
        }
    }
    public void displayAfter(){
        for (int i = 0 ; i < shapes.size();i++){
            Random rd = new Random();
            double a = rd.nextDouble()*10;
            System.out.println("Shape" + shapes.get(i).getName());
            System.out.println(shapes.get(i).resize(a));
        }
    }
}
