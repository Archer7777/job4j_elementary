package ru.job4j.practice;

import java.util.Scanner;

public class Les {

    public static double squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = 1;

        return a * Math.pow(x, 2) + b * x + c;
    }

    public static void main(String[] args) {
        System.out.println(Les.squareRoot());
    }
}
