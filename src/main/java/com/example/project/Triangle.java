package com.example.project;

public class Triangle implements Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        if (this.base <= 0 || this.height <= 0) {
            return 0.0;
        }

        return (this.base * this.height) / 2;
    }
}