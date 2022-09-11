package homework_10_09_2022;

import java.util.Scanner;

public class Task1 {
    //Пользователь вводит с клавиатуры строку. Произведите поворот строк и полученный результат выведите на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку!");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        System.out.print("Рузультат поворота строк = ");
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i]);
    }
}




