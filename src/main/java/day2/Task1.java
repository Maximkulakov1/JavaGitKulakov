package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число этажей:");
        Scanner et = new Scanner(System.in);
        int etaji = et.nextInt();
        if(etaji>0 && etaji<= 4){
            System.out.println("Малоэтажный дом");
        } else if(etaji>4 && etaji<=8){
            System.out.println("Среднеэтажный дом");
        } else if(etaji>9){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("ошибка ввода, введите кол-во этажей!");
        }

    }
}
