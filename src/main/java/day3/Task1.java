package day3;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner city = new Scanner(System.in);
        System.out.println("Enter the city");

        while (true) {
            String c = city.nextLine();
            if (c.equals("Стоп"))
                break;

            switch (c) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Unknow country");
            }
        }
        System.out.println("The End");
    }
}

