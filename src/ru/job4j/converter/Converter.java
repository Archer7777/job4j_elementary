package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 73;
        return rsl;
    }

    public static int euroToDollar(int value) {
        int rsl = value * 2;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 рублей это " + euro + " евро");
        int dollar = Converter.rubleToDollar(360);
        System.out.println("360 рублей это " + dollar + " долларов");
        int ruble = Converter.dollarToRuble(730);
        System.out.println("730 долларов это " + ruble + " рублей");
        int euroDol = Converter.euroToDollar(120);
        System.out.println("120 евро это " + euroDol + " долларов");
    }
}
