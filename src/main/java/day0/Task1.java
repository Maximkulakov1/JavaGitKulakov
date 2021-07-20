package day0;

public class Task1 {
    public static void main(String[] args) {
//      Java to string
        int i = 0;
        while (i<10){
            System.out.print("JAVA ");
            i++;
        }
        System.out.println(""+"\n");
//        Java to list
        for (int i2 =0; i2<10; i2++){
            System.out.println("JAVA");
        }
        System.out.println("");
//        Olimpiada by while
        int year = 1980;
        while (year <=2020){
            System.out.println("Олимпиада "+year+" года");
            year = year + 4;
        }
        System.out.println("");
//        Olimpiada by for
        for (int i3 = 1980; i3<=2020; i3 = i3 + 4){
            System.out.println("Олимпиада "+i3+" года");
        }
        System.out.println("");
//        Таблица умножения
        for(int n = 1; n<=9; n++){
            int k= 5;
            int s = n*k;
            System.out.println(n+ " x "+ k + " = "+ s);
        }
    }
}