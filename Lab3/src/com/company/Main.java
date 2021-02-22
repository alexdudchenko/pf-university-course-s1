package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calc1 Calc1 = new Calc1();
        Calc2 Calc2 = new Calc2();
        Calc3 Calc3 = new Calc3();
        try {
            switch (chooseTask()) { // выбор и решение задачи
                case 1:
                    System.out.println("Первое число z, второе - k");
                    System.out.println("Ваш результат - " + Calc1.calc1(Calc1.print(), Calc1.printForK()));
                    break;
                case 2:
                    System.out.println("Первое число t, второе - l");
                    System.out.println("Ваш результат - " + Calc2.calc2(Calc2.print(), Calc2.printForL()));
                    break;
                case 3:
                    System.out.println("Ваш результат - " + Calc3.calc3(Calc3.printForEps()));
                    break;

            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int chooseTask() // выбор задания
    {
        System.out.println("Выберите номер задания от 1 до 3 включительно: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a >= 1 && a <= 3) {
                return a;
            } else {
                throw new IllegalArgumentException("Вы выбрали неправильный номер задания");
            }
        } else {
            throw new IllegalArgumentException("Вы не выбрали задание");
        }
    }
}
