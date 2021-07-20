package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();

        while (true) {
            if (b == 0){ // попорбуй сравнить не строки а цифры
                System.out.println("Работа программы завершена");
//                break;
            }else {
                double c = a /b;
                System.out.println(c);
            }
break;
        }
    }
}

