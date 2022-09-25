package homework_05_09_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    //Пользователь с клавиатуры вводит элементы одномерного массива.
    // Необходимо найти сумму элементов массива, среднеарифметическое, отобразить на экран все элементы массива
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число размера массива!");
        int size = scanner.nextInt();
        int[] array = new int[size];
        double sum = 0;
        double arithmetic = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значения массива!");
            int num = scanner.nextInt();
            array[i] = num;
        }
        System.out.println("Массив = " + Arrays.toString(array));
        for (int j : array) {
            sum += j;
            arithmetic = sum / array.length;
        }
        System.out.println("Сумма элементов массива = " + sum);
        System.out.println("Среднеарифметическое массива = " + arithmetic);
    }
}
