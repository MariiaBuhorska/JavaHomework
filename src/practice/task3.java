package practice;

import java.util.Scanner;

//Задание 3 Пользователь вводит с клавиатуры два числа. Необходимо найти сумму чисел, разницу чисел, произведение числе. Результат вычислений вывести на экран.
public class task3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое число");
    double first = scanner.nextDouble();
            System.out.println("Ведите второе число");
        double second = scanner.nextDouble();
        System.out.println("Сумма чисел = " + (first + second));
        System.out.println("Разница чисел = " + (first - second));
        System.out.println("Произведение чисел = " + first * second);




    }
}
