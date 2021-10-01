package ru.job4j.condtition;

public class Kino {

    public static void access(int age) {
        System.out.println("The age of the customer is: " + age);
        if (age > 18) {
            System.out.println("Welcome to the cinema.");
        }   else {
            System.out.println("It is not for you");
        }
    }

    public static void main(String[] args) {
        Kino.access(21);
        Kino.access(16);
    }

}
