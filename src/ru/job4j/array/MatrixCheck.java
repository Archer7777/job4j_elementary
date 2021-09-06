package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char i = 0; i < board.length; i++) {
            for (int j = 0; j < row; j++) {
                if (row == 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
