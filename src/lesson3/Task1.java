package lesson3;
import java.util.Scanner;
public class Task1 {
    //Задание 1 Пользователь вводит с клавиатуры число.
    // Необходимо проверить его на четность и нечетность.
    // Если число четное требуется вывести на экран число и надпись «Even number».
    // Если число нечетное выведите на экран число и надпись «Odd number».
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число!");
       number = scan.nextInt();
        if (number % 2 ==0) {
            System.out.println("Ever number");
        }
        else
        System.out.println("Odd number");
    }
}
