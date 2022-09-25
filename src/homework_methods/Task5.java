package homework_methods;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    //Заполнить массив на 10 элементов случайными числами от -10 до +10.
    // Посчитать количество повторяющихся значений. Вывести на консоль только повторяющиеся элементы и количество повторений.
    //Пример:
    //0 – 5 раз
    //2 – 3 раза
    //7 – 1 раз

    public static void main (String[] args) {

        int[] arr = new int[10];
        Random random = new Random ();
        random.nextInt (-10, 10);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt (-10, 10);  // массив  случайных чисел
        }
        Arrays.sort (arr); // сортировка массива
        System.out.println ("Массив содержит: " + Arrays.toString (arr)); // печать массива
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {       // повторяющиеся элементы
                    count++;
                    System.out.print (arr[j] + " - ");
                }
            }
            switch (count) {     // количество повторений
                case 5, 6, 7, 8, 9, 10 -> System.out.println (count + " раз");
                case 2, 3, 4 -> System.out.println (count + " раза");
            }
        }
    }
}