package homework_29_08_2022;

import java.util.Scanner;

public class Task7 {
    //Пользователь вводит с клавиатуры букву. Программа
    //должна определить, в какой раскладке введена буква – в латинской или кирилице. Вывести в консоль: «латиница», если
    //буква введена латиницей или «кирилица», если буква относится к кирилическому алфавиту. Если введена цифра, а не
    //буква, вывести «цифра». Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить».
    public static void main(String[] args) {
        System.out.println("Введите букву!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean onlyLatinAlphabet = answer.matches("[a-zA-Z]");
        boolean onlyCyrillicAlphabet = answer.matches("[а-яёА-ЯЁ]");
        boolean onlyNumbers = answer.matches("[0-9]");
        if (onlyLatinAlphabet){
            System.out.println("Латиница");}
        else if (onlyCyrillicAlphabet){
            System.out.println("Кириллица");}
        else if (onlyNumbers){
            System.out.println("Цифра");}
        else
        System.out.println("Невозможно определить");
            }
}
