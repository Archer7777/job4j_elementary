package ru.job4j.condtition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && first < third) {
            result = third;
        }
        if (second > third && second > first) {
            result = second;
        }
        return result;
    }
}
