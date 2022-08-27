package homework;
public class Task05 {
    //Подсчитать площадь и длину окружности для круга с радиусом R. Радиус должен быть задан константой в программе. Вывести результат на консоль.
    public static void main(String[] args) {
        final double constp = 3.14;
        final int constr = 5;
        System.out.println("Длина окружности = 2πr = " + 2 * constp * constr);
        System.out.println("Площадь круга = S = π*r*r = " + constp * Math.pow(constr, 2));
    }
}
