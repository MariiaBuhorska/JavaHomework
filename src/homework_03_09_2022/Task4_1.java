package homework_03_09_2022;

import java.util.Scanner;

public class Task4_1 {
    //Пользователь вводит с клавиатуры два числа.
    // Нужно посчитать сумму чисел в указанном диапазоне, а также среднеарифметическое
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int one = scanner.nextInt();
        System.out.println("Введите второе число!");
        int two = scanner.nextInt();
        one = Math.min(one, two);
        two = Math.max(one, two);
        int i = one;
        int summa = 0;
        while (i <= two) {
            summa += i;
            i++;
        }
        System.out.println("Сумма чисел в указанном диапазоне = " + summa);

        double r = ((two - one) + 1);   // r = количество чисел в диапазоне
        System.out.println("Количество чисел в диапазоне = " + r);
        double arithmeticMean = summa / r;
        System.out.println("Среднеарифметическое в указанном диапазоне = " + arithmeticMean);
    }
}


