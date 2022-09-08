package lesson5;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
        public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число размера массива!");
        int num1 = scanner.nextInt();

        int[] arr = new int[num1];
        for (int i = 0; i <num1; i++) {
            System.out.println("Введите значения массива!");
            int num2 = scanner.nextInt();
            arr[i] = num2;
        }
        System.out.println("Массив = " + Arrays.toString(arr));
    }
}
