package homework_05_09_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    //Пользователь с клавиатуры вводит элементы одномерного массива и некоторое число.
    // Необходимо посчитать сколько раз данное число присутствует в массиве.
    public static void main (String[] args) {
        int count = 0;
        boolean found = false;
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите число размера массива!");
        int size = scanner.nextInt ();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println ("Введите значения массива!");
            int num = scanner.nextInt ();
            array[i] = num;
        }
        System.out.println ("Массив = " + Arrays.toString (array));
        System.out.println ("Введите любое число!");
        int numSearch = scanner.nextInt ();
        for (int j : array) {
            if (j == numSearch) {
                found = true;
                count++;
            }
        }
        if (found)
            System.out.println ("Заданное число встречается в массиве " + count + " раз ");
        else {
            System.out.println ("Число не найдено!");
        }
    }
}



