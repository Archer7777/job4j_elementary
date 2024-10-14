package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {

        if (size <= 0) {
            System.out.println("Размер должен быть положительным числом");
        }

        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean isLeftDiagonal = cell == row; /* добавить условие, по которому нужно определить ставить ли символ или нет. */
                boolean isRightDiagonal = row == size - cell - 1; /* добавить условие, что нужно ставить элемент в правый угол. */
                if (isLeftDiagonal || isRightDiagonal) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
