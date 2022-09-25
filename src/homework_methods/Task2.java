package homework_methods;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    //Напишите метод для нахождения максимума в массиве. Массив передаётся в качестве параметра

    public static void main (String[] args) {
        int[] array = createRandomArray ();
        printArray (array);
        System.out.println ("Максимальный элемент массива = " + maxElementArray (array));
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

    static int maxElementArray (int[] array) {
        int maxElement = array[0];
        for (int i : array) {
            if (i > maxElement) {
                maxElement = i;
            }
        }
        return maxElement;
    }

    static void printArray (int[] array) {
        for (int i : array) {
            System.out.print (i + " ");
        }
        System.out.println ();

    }
}

