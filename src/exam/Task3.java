package exam;

import java.util.Scanner;

public class Task3 {
    //а ввод в программу натурального числа из диапазона [1..25] программа выводит это число и согласованное с ним слово «книга».
    //апример, на ввод числа 1 программа выводит «1 книга», на ввод числа 2 — «2 книги» и т. д.
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите число из диапазона [1..25]!");
        scanner.hasNextInt ();
        int number = scanner.nextInt ();
        switch (number) {
            case 1, 21 -> System.out.println (number + " книга.");
            case 2, 3, 4, 22, 23, 24 -> System.out.println (number + " книги.");
            case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25 ->
                    System.out.println (number + " книг.");
        }
    }
}

