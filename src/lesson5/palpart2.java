package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class palpart2 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку!");
    String palindrome = scanner.nextLine();
        System.out.println(palindrome);
    int pal = palindrome.length();
        System.out.println(palindrome.length());
        System.out.println(pal);
    char[] array1 = new char[pal];
        System.out.println(Arrays.toString(array1));
    //char[] charArray = new char[pal];
    char[] charArray = palindrome.toCharArray();
        System.out.println(Arrays.toString(charArray));

        for (int i = 0; i < pal; i++) {
        array1[i] = palindrome.charAt(i);
    }
    // переворот массива символов
        for (int j = 0; j < pal; j++) {
        charArray[j] = array1[pal - 1 - j];
    }
    String itsPalindrome = new String(charArray);
        System.out.println("Введенная строка - палиндром! \n" + palindrome + " = " + itsPalindrome);
}
}
