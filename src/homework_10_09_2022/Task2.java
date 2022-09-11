package homework_05_09_2022;

import java.util.Scanner;

public class Task2 {
    //Пользователь вводит с клавиатуры строку и слово для поиска. Посчитайте сколько раз в строке встречается искомое слово.
    // Полученное число выведите на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку!");
        String str = scanner.nextLine();
        System.out.println("Введите слово для поиска!");
        String word = scanner.nextLine();
        System.out.println(str.length());

        //int word1 = str.indexOf(word); // Нахождение слова в строке
        int i = str.indexOf(word);
        int count = 0;
        while (i > 0) {
            count++;i--;
            i = str.indexOf(word, i + 1);

        }
    }
}
