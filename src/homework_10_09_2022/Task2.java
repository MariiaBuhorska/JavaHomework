package homework_10_09_2022;

import java.util.Scanner;

public class Task2 {
    //Пользователь вводит с клавиатуры строку и слово для поиска. Посчитайте сколько раз в строке встречается искомое слово.
    // Полученное число выведите на экран.
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите любую строку!");
        String str = scanner.nextLine ();
        System.out.println ("Введите слово для поиска!");
        String word = scanner.nextLine ();

        int index = str.toLowerCase ().indexOf (word);
        int count = 0;
        while (index != -1) {
            index = str.indexOf (word, index + 1);
            count++;
        }
        System.out.println ("Слово - " + word + " встречается в строке " + count + " раз.");
    }
}
