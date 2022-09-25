package exam;

import java.util.Scanner;

public class Task6 {
    //Написать программу, которая принимает стоимость покупок в магазине и выдает сумму к оплате с учетом следующей скидки:
    //- 0 – 250: нет скидки
    //- 251 – 500: скидка 5%
    //- 501 – 1000: скидка 10%
    // - 1001 и более: скидка 15%

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите сумму покупок!");
        scanner.hasNextDouble ();
        double a = scanner.nextDouble ();         //a - стоимость покупок
        double b = getDiscount (a);              // b - сумма скидки
        System.out.println ("Сумма к оплате = " + getTotalPayable (a, b));
    }

    // с помощью метода узнаем сумму скидки
    public static double getDiscount (double a) {
        double x = 0;
        if (a > 0 && a <= 250) {
            System.out.print ("Сумма покупки = " + a + ". У Вас нет скидки. ");
        }
        if (a >= 251 && a <= 500) {
            x = 5;
            System.out.print ("Сумма покупки = " + a + ". Ваша скидка = " + x + " % ");
        }
        if (a >= 501 && a <= 1000) {
            x = 10;
            System.out.print ("Сумма покупки = " + a + ". Ваша скидка = " + x + " % ");
        }
        if (a >= 1001) {
            x = 15;
            System.out.print ("Сумма покупки = " + a + ". Ваша скидка = " + x + " % ");
        } else if (a <= 0) {
            System.out.println ("Неверное значение. Повторите еще раз! ");
        }
        double b = (a / 100) * x;
        return b;
    }

    // с помощью метода определяем итоговую сумму к оплате
    public static double getTotalPayable (double a, double b) {
        return a - b;
    }
}

        //      Не знаю зачем я мучилась, но Вы пожелали с методами) Старалась!
