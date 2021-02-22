package com.company;
import java.lang.Math;

public class Task66 {

    public static void main(String[] args){
        int[] A = new int[5];
        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 1000);
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) Math.round(Math.random() * 1000);
        }

        printArrays(A);
        printArrays(B);
        printArrays(uniteArrays(A, B));
    }

    public static int[] uniteArrays(int[] a, int[] b) {
        int[] C = new int[a.length + b.length];
        System.arraycopy(a, 0, C, 0, a.length);
        System.arraycopy(b, 0, C, a.length, b.length);
        return C;
    }

    public static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.print("\n");
    }
}
