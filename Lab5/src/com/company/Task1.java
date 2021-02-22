package com.company;

public class Task1 {

    public static void main(String[] args) {

        int[][] example = {{0, 1, 1, 2}, {1, 0, 2, 1}, {1, 0, 0, 0}, {0, 1, 2, 0}};
        try {
            checkAndRunMatrix(example);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAndRunMatrix(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j] != 0) {
                        throw new IllegalArgumentException("На главной диагонали не ноль");
                    }
                } else {
                    int el = matrix[i][j];
                    int revEl = matrix[j][i];
                    if (!((el == 2 && revEl == 0) || (el == 0 && revEl == 2) || (el == 1 && revEl == 1))) {
                        throw new IllegalArgumentException("Неправильно введенные данные. Ошибка при сравнении значения " +
                                "и ему обратного");
                    }
                }
            }
        }
        System.out.println(getNumberOfWinners(matrix));
    }


    public static int getNumberOfWinners(int[][] results) {

        int numberOfWinners = 0;

        for (int[] i: results) {
            int defeat = 0;
            int win = 0;

            for (int j: i) {
                if (j == 0) {
                    defeat++;
                } else if (j == 2) {
                    win++;
                }
            }

            if (win > (defeat - 1)) {
                numberOfWinners++;
            }
        }
        return numberOfWinners;
    }
}
