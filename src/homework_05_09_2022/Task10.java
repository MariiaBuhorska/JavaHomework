package homework_05_09_2022;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    //Есть одномерный массив, заполненный случайными числами. На основании данных этого массива нужно:
    //■ Создать одномерный массив, содержащий только четные числа из первого массива;
    //■ Создать одномерный массив, содержащий только нечетные числа из первого массива;
    //■ Создать одномерный массив, содержащий только отрицательные числа из первого массива;
    //■ Создать одномерный массив, содержащий только положительные числа из первого массива
    public static void main (String[] args) {
        int count1, count2, count3, count4, index, index2, index3, index4;
        count1 = count2 = count3 = count4 = index = index2 = index3 = index4 = 0;
        Random random = new Random ();
        int[] arr = new int[10];
        random.nextInt (-10, 50);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt (-10, 50);  // массив  случайных чисел
        }
        for (int j : arr) {
            if (j % 2 == 0) {                    // четные числа массива
                count1++;
            }
            if (j % 2 != 0) {                   // нечетные числа массива
                count2++;
            }
            if (j > 0) {                        // положительные числа массива
                count3++;
            }
            if (j < 0) {                         // отрицательные числа массива
                count4++;
            }
        } // создание новых массивов, равных количеству заданных чисел в первом массиве
        int[] arrEven = new int[count1];
        int[] arrOdd = new int[count2];
        int[] arrPositive = new int[count3];
        int[] arrNegative = new int[count4];
        // index - текущий индекс элемента нового массива.
        for (int j : arr) {
            if (j % 2 == 0) {
                arrEven[index] = j;
                index++;
            }
            if (j % 2 != 0) {
                arrOdd[index2] = j;
                index2++;
            }
            if (j > 0) {
                arrPositive[index3] = j;
                index3++;
            } else if (j < 0) {
                arrNegative[index4] = j;
                index4++;
            }
        }
        System.out.println ("Массив содержит: " + Arrays.toString (arr));
        System.out.println ("Массив четных значений: " + Arrays.toString (arrEven));
        System.out.println ("Массив нечетных значений:" + Arrays.toString (arrOdd));
        System.out.println ("Массив положительных значений:" + Arrays.toString (arrPositive));
        System.out.println ("Массив отрицательных значений:" + Arrays.toString (arrNegative));
    }
}
