package practice;

import java.util.Scanner;

public class gethypotenuse {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Дано два прямоугольных треугольника ABC и BCD, у которых есть общая сторона ВС");
        System.out.println ("Введите длину катета АВ!"); //a
        scanner.hasNextDouble ();
        double legAB = scanner.nextDouble ();
        System.out.println ("Ведите длину катета АС");   //b
        double legAC = scanner.nextDouble ();
        System.out.println ("Ведите длину катета CD");   //a1
        double legCD = scanner.nextDouble ();
        // c2 = a2 + b2
        double hypotenuseBC = Math.sqrt (Math.pow (legAB, 2) + Math.pow (legAC, 2)); //c = b1
        System.out.println ("Гипотенуза ВС равна " + hypotenuseBC);
        double hypotenuseBD = Math.sqrt (Math.pow (hypotenuseBC, 2) + Math.pow (legCD, 2)); //c1
        System.out.println ("Гипотенуза BD равна  " + hypotenuseBD);
        // Периметр равен сумме всех внешних сторон - AB, AC, CD, BD.
        double perimeter = legAB + legAC + legCD + hypotenuseBD;
        System.out.println ("Периметр фигуры равен " + perimeter);
    }
}
