package homework_10_09_2022;

import java.util.Scanner;

public class Task4 {
    //Пользователь вводит с клавиатуры строку. Проверьте является ли введенная строка палиндромом.
    //  Палиндром — слово или текст, которое читается одинаково слева направо и справа налево.
    //  Например, кок; А роза упала на лапу Азора; доход; А буду я у дуба
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку!");
        String palindrome = scanner.nextLine();
        char[] array = palindrome.toLowerCase().replace(" ", "").toCharArray();
        boolean istrue = true;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if (!(array[i] == array[j])) {
                istrue = false;
                System.out.println("Введенная строка - не палиндром");
                break;
            }
        }
        if (istrue) {
            System.out.println("Введенная строка - палиндром!");
        }
    }
}