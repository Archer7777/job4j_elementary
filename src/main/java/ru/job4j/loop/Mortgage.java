package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * (percent / 100) - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        int result = Mortgage.year(558849, 696732, 11.7);
        System.out.println("Закроем за " + result + " года(лет)");
    }
}
