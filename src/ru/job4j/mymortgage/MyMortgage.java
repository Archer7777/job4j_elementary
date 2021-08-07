package ru.job4j.mymortgage;

/*****
 **
 ** Рассчет аннуитентного платежа
 ** по кредиту на Java
 **
 ** price   (double) - сумма кредита
 ** pay     (double) - первый платеж
 ** percent (double) - процентная ставка
 ** years   (double) - срок кредита (лет)
 **
 */

public class MyMortgage {
    public static double mortgage(double price, double pay, double percent, int years) {
        double i = percent / 12 / 100;
        double n = years * 12;
        double r = (price - pay) * ((i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1));
        return Math.round(r);
    }

    public static void main(String[] args) {
        double price = 3000000;
        double pay = price * 30 / 100;
        double percent = 9;
        int years = 20;

        System.out.println("Общая сумма кредита: " + price + " руб");
        System.out.println("Первый платеж: " + pay + " руб");
        System.out.println("Ставка: " + percent + " %");
        System.out.println("Срок кредита: " + years + " лет");
        System.out.println("Ежемесячный платеж: " + MyMortgage.mortgage(price, pay, percent, years) + " руб");
    }
}

