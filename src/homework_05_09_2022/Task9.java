package homework_05_09_2022;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    //В одномерном массиве, заполненном случайными числами вычислить:
    //■ Сумму отрицательных чисел;
    //■ Сумму четных чисел;
    //■ Сумму нечетных чисел;
    //■ Произведение элементов с индексами кратными 3;
    //■ Произведение элементов между минимальным и максимальным элементом;
    //■ Сумму элементов, находящихся между первым и последним положительными элементами

    public static void main (String[] args) {
        int count, count1, count2, count3, sum1, sum2, sum3;
        count = count1 = count2 = count3 = sum1 = sum2 = sum3 = 0;

        Random random = new Random ();
        int[] arr = new int[15];
        random.nextInt (-20, 30);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt (-20, 30);      // массив случайных чисел
        }
        for (int j : arr) {
            if (j < 0) {        //отрицательные числа массива
                sum1 += j;
                count++;
            }
            if (j % 2 == 0) {   //четные числа массива
                sum2 += j;
                count1++;
            }
            if (j % 2 != 0) {   //нечетные числа массива
                sum3 += j;
                count2++;
            }
        }
        int result1 = 1;
        for (int k = 3; k < arr.length; k += 3) {   //индекс кратный 3
            if (k % 3 == 0) {
                result1 *= arr[k];
                count3++;
            }
        }
        int min = arr[0], max = arr[0];
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];       // минимальное число в массиве
                minIndex = i;       // индекс минимального числа в массиве
            } else if (max < arr[i]) {
                max = arr[i];         // максимальное число в массиве
                maxIndex = i;        // индекс максимального числа в массиве
            }
        }
        int result2 = 1;
        for (int i = Math.min (minIndex + 1, maxIndex); Math.max (minIndex, maxIndex) > i; i++) {
            result2 *= arr[i];
        }
        int firstIndex;
        int lastIndex;

        for (firstIndex = 0; firstIndex < arr.length; firstIndex++) {
            if (arr[firstIndex] > 0) break;
        }
        for (lastIndex = arr.length - 1; lastIndex > firstIndex; lastIndex--) {
            if (arr[lastIndex] > 0) break;
        }
        int l;
        int result3 = 0;
        for (l = firstIndex + 1; l < lastIndex; l++) {
            result3 += arr[l];
        }
        System.out.println ("Массив содержит: " + Arrays.toString (arr));
        System.out.println ("Количество отрицательных элементов массива = " + count + ". Их сумма = " + sum1);
        System.out.println ("Количество четных элементов массива = " + count1 + ". Их сумма = " + sum2);
        System.out.println ("Количество нечетных элементов массива = " + count2 + ". Их сумма = " + sum3);
        System.out.println ("Количество элементов с индексами кратными 3 = " + count3 + ". Их произведение = " + result1);
        System.out.println ("Минимальный элемент массива = " + min + ". Максимальный элемент массива = " + max + ". Их произведение = " + result2);
        System.out.println ("Сумма элементов, находящихся между первым и последним положительными элементами = " + result3);
    }
}
