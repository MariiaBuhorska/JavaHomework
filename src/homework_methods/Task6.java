package homework_methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    // Напишите метод, который ищет некоторое число в массиве с помощью двоичного поиска.

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] array = createRandomArray ();
        System.out.println ("Для начала бинарного поиска, введите KEY – значение для поиска!");
        int key = scanner.nextInt ();
        printArray (array);
        binarySearchNumber (array, key);
    }

    public static int[] createRandomArray () {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите длину массива!");
        int[] array = new int[(scanner.nextInt ())];
        Random random = new Random ();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt (-50, 50);
        }
        Arrays.sort (array);
        return array;
    }

    public static void binarySearchNumber (int[] array, int key) {
        int count = 0;    //  количество сравнений
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // средний индекс массива
        int midIndex = (firstIndex + lastIndex) / 2;

        while ((array[midIndex] != key) && (firstIndex <= lastIndex)) {
            count++;
            if (array[midIndex] > key) {  // если число меньше заданного для поиска
                lastIndex = midIndex - 1; // уменьшаем позицию на 1.
            } else {
                firstIndex = midIndex + 1;    // иначе увеличиваем на 1
            }
            midIndex = (firstIndex + lastIndex) / 2;
        }
        if (firstIndex <= lastIndex) {
            System.out.println (key + " является " + ++midIndex + " элементом в массиве");
            System.out.println ("Метод двоичного поиска нашел число после " + count + " сравнений");
        } else {
            System.out.println ("Элемент в массиве не найден. Метод двоичного поиска закончил работу после " + count + " сравнений");
        }
    }

    static void printArray (int[] array) {
        for (int i : array) {
            System.out.print (i + " ");
        }
        System.out.println ();

    }
}
