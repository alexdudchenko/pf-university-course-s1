package com.company;

public class Task2 {

    public static void main(String[] args) {
        int[][] example = {{1, 2, 3}, {1, 4, 5}, {8, 9, 10}, {14, 15, 21}};

        printMatrix(example);

        System.out.print("\n\n"); // для лучшей читаемости

        printMatrix(checkAndTranspose(example));
    }

    public static int[][] checkAndTranspose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Матрица не задана");
        }
        return transpose(matrix);
    }

    public static void printMatrix(int[][] tranMat) {
        for (int i = 0; i < tranMat.length; i++) {
            for (int j = 0; j < tranMat[i].length; j++) {
                System.out.print(tranMat[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] tranMat = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tranMat[j][i] = matrix[i][j];
            }
        }
        return tranMat;
    }
}
