package homework_05_09_2022;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    //В одномерном массиве, заполненном случайными числами, определить минимальный и максимальный элементы,
    // посчитать количество отрицательных элементов, посчитать количество положительных элементов, посчитать количество нулей.
    // Результаты вывести на экран
    public static void main (String[] args) {
        int count, count1, count2, index, index2;
        count = count1 = count2 = index = index2 = 0;
        Random random = new Random ();
        int[] arr = new int[10];
        random.nextInt (-10, 50);

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt (-10, 50);
        }
        for (int k : arr) {
            if (k < min) {
                min = k;
            }
            if (k > max) {
                max = k;
            }
        }
        for (int k : arr) {
            if (k == 0) {
                count++;
            }
            if (k > 0) {
                count1++;
            }
            if (k < 0) {
                count2++;
            }
        }
        int[] arrPositive = new int[count1];
        int[] arrNegative = new int[count2];

        for (int j : arr) {
            if (j > 0) {
                arrPositive[index] = j;
                index++;
            }
            if (j < 0) {
                arrNegative[index2] = j;
                index2++;
            }
        }
        System.out.println ("Массив содержит следующие элементы: " + Arrays.toString (arr));
        System.out.println ("Максимальный элемент массива = " + max + ". Минимальный элемент массива = " + min);
        System.out.println ("Количество 0 в массиве = " + count);
        System.out.println ("Количество положительных элементов  = " + count1 + " " + Arrays.toString (arrPositive));
        System.out.println ("Количество отрицательных элементов массива = " + count2 + " " + Arrays.toString (arrNegative));
    }
}

