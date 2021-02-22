package com.company;

import java.util.Scanner;

public class Calc3 {

    public static double calc3( double eps) // считает 3ее
    {

        double result = 0;
        int i = 1;
        double dodanok = (Math.pow(-1, i + 1)) / (i * (i + 1) * (i + 2));
        while (Math.abs(dodanok) >= eps) {

            result = result + dodanok;
            i++;
            dodanok = (Math.pow(-1, i + 1)) / (i * (i + 1) * (i + 2));

        }
        return result;
    }

    public static double printForEps() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите погрешность eps больше 0: ");
        if (sc.hasNextDouble()) {
            double eps = sc.nextDouble();
            if (eps > 0) {
                return eps;
            } else {
                throw new IllegalArgumentException("Точность вычисления была введена неправильно");
            }
        } else {
            throw new IllegalArgumentException("Вы не ввели число");
        }
    }
}
