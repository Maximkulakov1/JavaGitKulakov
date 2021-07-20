package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = chislo.nextInt();
        System.out.println("Введите второе число");
        int b = chislo.nextInt();

        if (a < b) {
            for (int i = a; i < b; i++) {
                if ((i % 5 == 0) && (i % 10 != 0)) {
                    System.out.print(i+" ");
                }
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
