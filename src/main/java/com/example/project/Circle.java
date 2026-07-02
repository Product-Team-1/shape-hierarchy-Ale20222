package com.example.project;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (this.radius <= 0){
            return 0.0;
        }
        return Math.PI * this.radius * this.radius;
    }
}
