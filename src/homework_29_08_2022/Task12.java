package homework_29_08_2022;

import java.util.Scanner;

public class Task12 {
    //Программа запрашивает шестизначное число. После ввода определяет, будет ли являться «счастливым» билет с таким номером
    // (сумма первых трех цифр совпадает с суммой трех последних).
    //Пример входных данных:
    //423027
    //954832
    //Вывод:
    //Да
    //Нет
        public static void main(String[] args) {

         System.out.println("Проверь свою удачу! Введи шестизначное число!");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        String string = Integer.toString(answer);

            char n1 = string.charAt(0);
            char n2 = string.charAt(1);
            char n3 = string.charAt(2);
            char n4 = string.charAt(3);
            char n5 = string.charAt(4);
            char n6 = string.charAt(5);

            if ((n1 + n2 + n3) == (n4 + n5 + n6)) {
                System.out.println("Счастливый билет? Да!");
            } else
                System.out.println("Счастливый билет? Прости, но нет(((");
            }
}
