package practice;

import java.util.Scanner;

public class functionValue {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Дана функция x = 3,56(a + b)3 – 5,8b2 + 3,8a -1,5. Чему равен x? ");
        System.out.println ("Введите значение a!");
        scanner.hasNextDouble ();
        double a = scanner.nextDouble ();
        System.out.println ("Введите значение b!");
        double b = scanner.nextDouble ();
        double i = Math.pow ((a + b), 3.0);
        double i1 = 3.56 * i;
        double i2 = 5.8 * Math.pow (b, 2.0);
        double i3 = 3.8 * a;
        System.out.println ("x = " + (i1 - i2 + i3 - 1.5));
    }
}


