package com.example.project;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        if (this.width <= 0 || this.height <= 0) {
            return 0.0;
        }

        return this.width * this.height;
    }
}
