package homework_29_08_2022;

import java.util.Scanner;
// "Решение квадратных уравнений"3
public class Task11 {
    //Найти корни квадратного уравнения и вывести их на экран, если они есть.
    // Если корней нет, то вывести сообщение об этом.
    // Конкретное квадратное уравнение определяется коэффициентами a, b, c, которые вводит пользователь с клавиатуры.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэфициенты a, b, c для решения квадратного уравнения!");
        System.out.println("Значение 'a' (a ≠ 0) равно?");
        int a = scanner.nextInt();
        System.out.println("Значение 'b' равно?");
        int b = scanner.nextInt();
        System.out.println("Значение 'c' равно?");
        int c = scanner.nextInt();
        //Квадратное уравнение — это уравнение вида ax2 + bx + c = 0, где коэффициенты a, b и c — произвольные числа, причем a ≠ 0.
        //Дискриминант — это просто число D = b2 − 4ac.
        //По знаку дискриминанта можно определить, сколько корней имеет квадратное уравнение. А именно:
        //1. Если D < 0, корней нет;
        //2.Если D = 0, есть ровно один корень;
        //3.Если D > 0, корней будет два.
//        String X = "x";
//        String equation = A * (XX) + (BX) + C;
//        equation = "0";
        int D = ((b*b)-(4*a*c));
        System.out.println("Дискриминант =  " + D);
    //  Основная формула корней квадратного уравнения
        double resultat1 = (((-b) + Math.sqrt(D))/2*a);
        double resultat2 = (((-b) - Math.sqrt(D))/2*a);
        if (D < 0 ) {
            System.out.println("К сожалению корней нет( Приходите завтра!");}
        else if (D == 0) {
            System.out.println("Корень квадратного уравнения = " + resultat2);}
        else if (D > 0) {
            System.out.println("Квадратное уравнение имеет два корня: " + resultat1 + " и " + resultat2);}
    }
}