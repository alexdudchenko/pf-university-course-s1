package com.company;

import java.util.Scanner;

public class Calc2 {

    public static double calc2(int t, int l) // считает 2ое задание
    {
        double result = 0;
        if (l % 2 == 0) {
            for (int i = 1; i <= t; i++) {
                result = result + (l / Math.sqrt(t));
            }
            return result;
        } else {
            for (int i = 1; i <= t; i++) {
                result = result + Math.sqrt(t * l);
            }
            return result;
        }
    }

    public static int printForL() // ввод числа с регуляцией l >=1
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число l, l >=1 :  ");
        if (sc.hasNextInt()) {
            int l = sc.nextInt();
            if (l >= 1) {
                return l;
            } else {
                throw new IllegalArgumentException("Число не из заданого диапазона");
            }
        } else {
            throw new IllegalArgumentException("Вы не ввели число");
        }
    }

    public static int print() // ввод числа
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a > 0) {
                return a;
            }
            else {
                throw new IllegalArgumentException("Введена неправильная верхняя граница суммы ряда");
            }
        } else {
            throw new IllegalArgumentException("Вы не ввели число");
        }
    }
}
