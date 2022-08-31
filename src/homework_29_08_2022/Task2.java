package homework_29_08_2022;

import java.util.Scanner;

public class Task2 {
//С клавиатуры вводится время (количество часов от 0 до 24) – программа выводит приветствие,
// соответствующее введенному времени (например, ввели 15 часов – выводится приветствие «Добрый день»)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество часов от 0 до 24");
               if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (!(answer >= 0 && answer <= 24)) {
        System.out.println("Повтори попытку!");}
                else {
                if (answer < 4) System.out.println("Доброй ночи!");
                if (answer >= 4 && answer < 12) System.out.println("Доброе утро!");
                if (answer >= 12 && answer < 17) System.out.println("Добрый день!");
                if (answer >= 17) System.out.println("Добрый вечер!");
            }
        }
        else
            System.out.println("Неверное значение!");
    }
}