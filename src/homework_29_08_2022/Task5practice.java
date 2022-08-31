package homework_29_08_2022;

import java.util.Scanner;

public class Task5practice {
    //Задание 5 Пользователь с клавиатуры вводит количество часов.
    // Если полученное значение находится в диапазоне от 0 до 6 нужно вывести надпись «Good Night»,
    // если в диапазоне от 6 до 13 «Good Morning»,
    // если в диапазоне от 13 до 17 «Good Day»,
    // если в диапазоне от 17 до 0 «Good Evening».
    // Верхняя граница диапазона не включается. Например, число 6 относится к 6 до 13.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 24");

        if (scanner.hasNextInt()) {
            int time = scanner.nextInt();
            if (!(time >= 0 && time <= 24)) {
                System.out.println("Нет такого времени!");
            } else {
                if (time < 6) System.out.println("Good Night");
                if (time >= 6 && time < 13) System.out.println("Good Morning");
                if (time >= 13 && time < 17) System.out.println("Good Day");
                if (time >= 17) System.out.println("Good Evening");
            }
        }
        else
            System.out.println("Неверное значение!");
    }
}