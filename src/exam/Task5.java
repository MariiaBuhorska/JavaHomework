package exam;

import java.util.Scanner;

public class Task5 {
//Найти периметр фигуры по заданным сторонам AB, AС, и CD (см. рисунок)
//Определить метод для расчета гипотенузы прямоугольного треугольника по его катетам.
//Периметр равен сумме всех внешних сторон - AB, AC, CD, BD
// Катеты AB - a, AC - b, CD - с. Гипотенузы BC, BD.
// Гипотенуза вычисляется по теореме Пифагора: c2 = a2 + b2. BC2 = AB2 + AC2; BD2 = BC2 + CD2

    public static double getHypotenuse (double a, double b, double c) {
        double hypotenuse = Math.sqrt (Math.pow (a, 2) + Math.pow (b, 2));
        return Math.sqrt (Math.pow (hypotenuse, 2) + Math.pow (c, 2));
    }

    public static void main (String[] args) {
        System.out.println ("Дано два прямоугольных треугольника ABC и BCD, у которых есть общая сторона ВС.");
        System.out.println ("Найти периметр фигуры по заданным сторонам AB, AС и CD!");
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите длину катета АВ!");
        scanner.hasNextDouble ();
        double a = scanner.nextDouble ();
        System.out.println ("Ведите длину катета АС");
        double b = scanner.nextDouble ();
        System.out.println ("Ведите длину катета CD");
        double c = scanner.nextDouble ();
        double hypotenuseBD = getHypotenuse (a, b, c);
        double perimeter = a + b + c + hypotenuseBD;
        System.out.println ("Периметр фигуры по заданным сторонам AB, AС и CD равен " + perimeter);
    }
}
