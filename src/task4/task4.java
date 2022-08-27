package task4;
import java.util.Scanner;
public class task4 {
    //Задание 4 Пользователь вводит с клавиатуры два числа. Первое число — это значение, второе число процент, который необходимо посчитать. Например, мы ввели с клавиатуры 50 и 10. Требуется вывести на экран 10 процентов от 50. Результат: 5.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double first = scanner.nextDouble();
        System.out.println("Ведите второе число");
        double second = scanner.nextDouble();
        System.out.println("Процент = " + (first * second) / 100);
    }
}
