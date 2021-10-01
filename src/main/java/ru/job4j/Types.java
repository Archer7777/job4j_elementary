package ru.job4j;

public class Types {

    public static void main(String[] args) {

        long l = 129;
        byte b = (byte) l;
        System.out.println("Значение 1 " + b);

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("Значение 2 " + rsl);

        char c = 45000;
        float y = c;
        System.out.println("Значение 3 " + y);

        double d = 121.19;
        byte k = (byte) d;
        System.out.println("Значение 4 " + k);

        short s = 1500;
        char o = (char) s;
        double t = c;
        System.out.println("Значение 5 " + t);

        int num = 1;
        long numUpper = (long) num;
        short numLower = (short) num;
        System.out.println(numUpper);
        System.out.println(numLower);

        int num2 = 11;
        int div = num2 / 3;
        int mod = num2 % 3;
        System.out.println(div);
        System.out.println(mod);

        float floatNum = 2.6f;
        int integerNum = (int) floatNum;
        System.out.println(integerNum);

        double result = Math.pow(3, 2);
        System.out.println(result);

        double result2 = Math.sqrt(9);
        System.out.println(result2);
    }
}