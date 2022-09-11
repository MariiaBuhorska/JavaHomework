package lesson4;

import java.util.Scanner;

public class Task3 {
    //Задание 2 Пользователь вводит с клавиатуры два числа. Нужно показать все четные числа в указанном диапазоне.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int one = scanner.nextInt();
        System.out.println("Введите второе число!");
        int two = scanner.nextInt();
        for (int i  = Math.min(one, two); i <= Math.max(one, two); i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

