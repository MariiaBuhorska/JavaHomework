package homework_29_08_2022;

import java.util.Scanner;

public class Task6 {
    //Определить количество дней в году, который вводит пользователь, и вывести их в консоль.
    // В високосном году – 366 дней, тогда как в обычном – 365.
    // Високосными годами являются все годы, делящиеся нацело на 4,
    // за исключением столетий, которые не делятся нацело на 400
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год!");
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
                System.out.println("Число дней = 366");}
            else  {
                System.out.println("Число дней = 365");
            }
        }
    }
}