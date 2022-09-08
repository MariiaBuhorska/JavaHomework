package homework_03_09_2022;

import java.util.Scanner;

public class Task2 {
    //Пользователь вводит с клавиатуры два числа.
    // Нужно показать все четные числа в указанном диапазоне.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int first = scanner.nextInt();
        System.out.println("Введите второе число!");
        int second = scanner.nextInt();
        System.out.println("Четные числа диапазона:");

        for (int i = Math.min(first, second); i <= Math.max(first, second); i++) {
            System.out.print("");
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}