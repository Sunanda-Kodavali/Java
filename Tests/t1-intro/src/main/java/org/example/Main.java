package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Calculator calculator = new Calculator();
        int x = calculator.add(1, 2);
        System.out.println(x);
    }
}