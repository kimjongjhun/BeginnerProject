package com.example.helloworld;

public class ExampleIf {

    public static void main(String[] args) {

        double x = (192 / 77);
        double y = (441 / 201);

        if (x < y) {
            System.out.println("X is less than Y");
        } else if (x == y) {
            System.out.println("X is equal to Y");
        } else {
            System.out.println("X is greater than Y");
        }

    }
}
