package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manHeight) {
        return (manHeight - 100) * 1.15;
    }

    public static double womanWeight(short womanHeight) {
        return (womanHeight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        short womanHeight = 167;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);

        System.out.println("Мужчина ростом " + manHeight + " см идеальный вес " + man + " кг");
        System.out.println("Женщина ростом " + womanHeight + " см идеальный вес " + woman + " кг");
    }
}
