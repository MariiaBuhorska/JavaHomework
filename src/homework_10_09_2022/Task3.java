package homework_10_09_2022;

import java.util.Scanner;

public class Task3 {
    //Пользователь вводит с клавиатуры строку, слово для поиска, слово для замены.
    // Произведите в строке замену одного слова на другое.
    // Полученную строку отобразите на экране
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку!");
        String str = scanner.nextLine();
        System.out.println("Введите слово для поиска!");
        String wordSearch = scanner.nextLine();
        System.out.println("Введите слово для замены!");
        String wordChange = scanner.nextLine();

        System.out.println("Видоизмененная строка - " + str.replace(wordSearch, wordChange));
    }
}
