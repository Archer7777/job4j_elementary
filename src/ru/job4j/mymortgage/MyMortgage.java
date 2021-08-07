package ru.job4j.mymortgage;

import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму долга: ");
        double price = in.nextInt();
        double pay = price * 30 / 100;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите процентную ставку: ");
        double percent = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите срок кредита (лет): ");
        int years = in2.nextInt();

        System.out.println();
        System.out.println("Общая сумма кредита: " + price + " руб");
        System.out.println("Первый платеж: " + pay + " руб");
        System.out.println("Ставка: " + percent + " %");
        System.out.println("Срок кредита: " + years + " лет");
        System.out.println("Ежемесячный платеж: " + MyMortgage.mortgage(price, pay, percent, years) + " руб");
    }
}

