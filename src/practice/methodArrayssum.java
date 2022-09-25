package practice;

import java.util.Arrays;
import java.util.Random;

public class methodArrayssum {
    //Task1. Напишите метод, вычисляющий сумму элементов массива. Массив передаётся в качестве параметра.

public class MethodSumElementsArray {
    public static void main (String[] args) { int lengthArray; methodSumElements (12);}
    private static void  methodSumElements (int lengthArray) {
        Random random = new Random ();
        int[] arrayElements = new int[lengthArray];
        random.nextInt (-20, 50);
        for (int i = 0; i < arrayElements.length; i++) {
            arrayElements[i] = random.nextInt (-20, 50);
        }
        System.out.println (Arrays.toString (arrayElements));
        int sumElements = 0;
        for (int i : arrayElements) {
            sumElements += i;
        }
        System.out.println ("Сумма элементов массива = " + sumElements);
    }
}
}
