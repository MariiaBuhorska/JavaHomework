package homework_03_09_2022;

import java.util.Scanner;

public class Task4_1 {
    //Пользователь вводит с клавиатуры два числа.
    // Нужно посчитать сумму чисел в указанном диапазоне, а также среднеарифметическое
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int maxN1 = scanner.nextInt();
        System.out.println("Введите второе число!");
        int maxN2 = scanner.nextInt();
        // Сумма чисел от 1 до заданного значения N = (N(N+1))/2, где N — наибольшее число ряда.
        int firstN = ((maxN1 - 1) * (maxN1)) / 2;
        int secondN = (maxN2 * (maxN2 + 1)) / 2;
        //Чтобы найти сумму целых чисел между двумя числами N1 and N2, нужно отдельно найти сумму до N1,
        // отдельно найти сумму до N2 и вычесть их друг из друга (вычесть сумму до меньшего значения N из суммы до большего значения N).
        int summa = secondN - firstN;
        System.out.println("Сумма чисел в указанном диапазоне = " + summa);

        double r = ((maxN2 - maxN1) + 1);   // r = количество чисел в диапазоне

        System.out.println("Количество чисел в диапазоне = " + r);
        double arithmeticMean = summa / r;
            System.out.println("Среднеарифметическое в указанном диапазоне = " + arithmeticMean);
    }
}