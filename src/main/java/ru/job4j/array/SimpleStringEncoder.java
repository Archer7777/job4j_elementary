package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {

        if (input.isEmpty()) {
            return "Строка не может быть пустой";
        }

        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += result + symbol;
                if (counter > 1) {
                    result += counter;
                }
                symbol = input.charAt(i);
                counter = 1;
            }

        }
        result += symbol;
        if (counter > 1) {
            result += counter;
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "aaabbbvdddrrr";
        String encoded = encode(input);
        System.out.println(encoded);
    }
}
