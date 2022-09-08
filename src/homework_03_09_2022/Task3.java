package homework_03_09_2022;

import java.util.Scanner;

public class Task3 {
    //Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа в указанном диапазоне.
    //        Если границы диапазона указаны неправильно требуется произвести нормализацию границ.
    //        Например, пользователь ввел 20 и 11, требуется нормализация после которой
    //        начало диапазона станет равно 11, а конец 20.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int first = scanner.nextInt();
        System.out.println("Введите второе число!");
        int second = scanner.nextInt();

        for (int i = Math.min(first, second); i <= Math.max(first, second); i++) {
            System.out.print("");
            if (first == second) {
                System.out.print("Неверное значение. Попробуй снова!");
                break;
            }
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
