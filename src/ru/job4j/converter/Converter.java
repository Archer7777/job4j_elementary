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

        int in1 = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(in1);
        boolean passed1 = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        int in2 = 360;
        int expectedDollar = 6;
        int outDollar = Converter.rubleToDollar(in2);
        boolean passed2 = expectedDollar == outDollar;
        System.out.println("360 rubles are 6. Test result : " + passed2);

        int in3 = 730;
        int expectedRuble = 53290;
        int outRuble = Converter.dollarToRuble(in3);
        boolean passed3 = expectedRuble == outRuble;
        System.out.println("730 dollars are 53290. Test result : " + passed3);

        int in4 = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in4);
        boolean passed4 = expected == out;
        System.out.println("120 euros are 240. Test result : " + passed4);
    }
}
