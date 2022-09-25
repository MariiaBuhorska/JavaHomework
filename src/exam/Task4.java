package exam;

import java.util.Scanner;

public class Task4 {
    // Составить программу вычисления значения функции:
    // x = 3,56(a + b)3 – 5,8b2 + 3,8a -1,5 - при любых значениях a и b (запрашиваем у пользователя).
    public static void main (String[] args) {
        System.out.println ("Дана функция x = 3,56(a + b)3 – 5,8b2 + 3,8a -1,5. Чему равен x? ");
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите значение a!");
        scanner.hasNextInt ();
        int a = scanner.nextInt ();
        System.out.println ("Введите значение b!");
        int b = scanner.nextInt ();

        functionValue (a, b);
    }

    public static void functionValue (int a, int b) {
        double i = Math.pow ((a + b), 3.0);
        double i1 = 3.56 * i;
        double i2 = 5.8 * Math.pow (b, 2.0);
        double i3 = 3.8 * a;
        double result = (i1 - i2 + i3 - 1.5);
        System.out.print ("x = " + result);
    }
}
