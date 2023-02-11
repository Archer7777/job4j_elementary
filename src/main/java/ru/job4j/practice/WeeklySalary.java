package ru.job4j.practice;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int regular = 10;
        int extra = 15;
        int doubleExtra = 30;
        int salary = 0;

        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    salary = salary + hours[i] * regular;
                } else {
                    salary = salary + (hours[i] - 8) * extra + 8 * regular;
                }
            } else {
                if (hours[i] <= 8) {
                    salary = salary + hours[i] * extra;
                } else {
                    salary = salary + (hours[i] - 8) * doubleExtra + hours[i] * extra;
                }
            }
        }
        return salary;
    }
}
