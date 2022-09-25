package homework_methods;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    //Напишите метод, вычисляющий сумму элементов массива. Массив передаётся в качестве параметра.

    public static void main (String[] args) {
        int [] array = createRandomArray ();
        printArray (array);
        System.out.println ("Сумма элементов массива: " + sumElementsArray (array));
    }

    public static int[] createRandomArray () {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите длину массива!");
        int[] array = new int[scanner.nextInt ()];
        Random random = new Random ();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt (-50, 50);
        }
        return array;
    }

    static int sumElementsArray (int[] array) {
        int sumElements = 0;
        for (int i : array) {
            sumElements += i;
        }
        return sumElements;
    }

    static void printArray (int[] array) {
        for (int i : array) {
            System.out.print (i + " ");
        }
        System.out.println ();
    }
}
