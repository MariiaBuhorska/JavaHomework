import java.util.Scanner;

public class Task2 {
    //Задание 1 Пользователь вводит с клавиатуры два числа. Нужно показать все числа в указанном диапазоне.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int one = scanner.nextInt();
        System.out.println("Введите второе число!");
        int two = scanner.nextInt();
        for (int i = one; i <= two; i++) {
            System.out.println(i);
        }
    }
}