package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class ShapeHierarchy {
    public static void main(String[] args) {
        // TODO: create a list/array of shapes and print each area (polymorphism)
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Circle(0));
        shapes.add(new Circle(-5));

        shapes.add(new Rectangle(10,10));
        shapes.add(new Rectangle(0,0));
        shapes.add(new Rectangle(-4,5));

        shapes.add(new Triangle(6,6));
        shapes.add(new Triangle(6,6));
        shapes.add(new Triangle(-2,8));

        for(Shape shape: shapes){
            System.out.println("Area : "+shape.getArea());
        }
        shapes.add(new Circle(1));
        shapes.add(new Rectangle(2,3));
        shapes.add(new Triangle(3,4));

        for(Shape shape: shapes){
            System.out.println("Area : "+shape.getArea());
        }
    }
}
