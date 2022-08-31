package lesson3;
import java.util.Scanner;
public class Task3 {
    //Задание 3 Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит на экран максимум из трёх, минимум из трёх или среднеарифметическое трёх чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа через пробел");
        String num1 = scanner.next();
        String num2 = scanner.next();
        String num3 = scanner.next();

        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println("Num3 = " + num3);

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int number3 = Integer.parseInt(num3);

        System.out.println("Если хотите максимальное число, нажмите >");
        System.out.println("Если хотите минимальное число, нажмите <");
        System.out.println("Если хотите среднеарифметическое число, нажмите =");

        String choice = scanner.next();
        System.out.println("Choice");

//        if (choice.equals(">")) {
//            int max = Math.max(number1, number2);
//            int max1 = Math.max(max, number3);
//            System.out.println("Максимальное число = " + max1);
//        }

        if (choice.equals(">")) {
           System.out.println("Максимальное число = " + Math.max((Math.max(number1, number2)), number3));
        }

        if (choice.equals("<")) {
            int max2 = Math.min(number1, number2);
            int max3 = Math.min(max2, number3);
            System.out.println("Минимальное число = " + max3);}

            if (choice.equals("=")) {
                System.out.println("Среднеарифметическое число = " + (number1 + number2 + number3) / 3);
            }
        }
    }

