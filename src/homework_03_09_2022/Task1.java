package homework_03_09_2022;

import java.util.Scanner;

public class Task1 {
    // Пользователь вводит с клавиатуры два числа. Нужно показать все числа в указанном диапазоне.
    // Диапазон  - разница между наибольшим и наименьшим значениями в наборе чисел.
    // Чтобы найти его, вычтите наименьшее число в распределении из наибольшего.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int first = scanner.nextInt();
        System.out.println("Введите второе число!");
        int second = scanner.nextInt();

        for (int i  = Math.min(first, second); i <= Math.max(first, second); i++) {
            System.out.print(i + " ");
        }
    }
}
