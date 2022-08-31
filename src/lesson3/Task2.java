package lesson3;

import java.util.Scanner;

public class Task2 {
    //Задание 2
// Пользователь вводит с клавиатуры три числа.
// В зависимости от выбора пользователя программа
// выводит на экран сумму трёх чисел или произведение
// трёх чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа через пробел");
        String num1 = scanner.next();
        String num2 = scanner.next();
        String num3 = scanner.next();

        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println("Num3 = " + num3);

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int number3 = Integer.parseInt(num3);

        System.out.println("Если хотите сумму чисел, нажмите +");
        System.out.println("Если хотите произведение чисел, нажмите *");

        String choice = scanner.next ();
        System.out.println("Choice");

        if (choice.equals("+")){
            System.out.println(number1 + number2 + number3);
        } else if (choice.equals("*")) {
            System.out.println(number1 * number2 * number3);
        } else {
            System.out.println("Ошибка ввода");
        }
    }
    }