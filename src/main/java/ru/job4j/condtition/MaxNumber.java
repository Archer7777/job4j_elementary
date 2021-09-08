package ru.job4j.condtition;

public class MaxNumber {

    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {
        int rsl = MaxNumber.max(2, 3, 4);
        System.out.println("Максимальное число = " + rsl);
    }
}
