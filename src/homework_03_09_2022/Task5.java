package homework_03_09_2022;

import java.util.Scanner;

public class Task5 {
    //Пользователь вводит с клавиатуры длину линии.
    //Нужно отобразить на экране горизонтальную линию из *, указанной длины.
    //Например, если было введено 7, тогда вывод на экран будет такой: *******

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, обозначающее длину горизонтальной линии");
        int num = scanner.nextInt();
        int x = 42;
        char c = (char) x;
        System.out.print("Длина линии = " + num + " ");

        for (int i = 0; i < num; i++) {
            System.out.print(c);
        }
    }
}