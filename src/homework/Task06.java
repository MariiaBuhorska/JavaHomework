package homework;
public class Task06 {
    //Есть прямоугольник, у которого известна ширина w и высота h. Найти и вывести на консоль периметр и площадь
    //заданного прямоугольника. Высота и ширина прямоугольника должна задаваться константными переменными в коде
    //программы.
    public static void main(String[] args) {
        final int constw = 8;
        final int consth = 4;
        System.out.println("Периметр прямоугольника = P = 2 × (w + h) = " + 2 * (constw + consth));
        System.out.println("Площадь прямоугольника = S = w × h = " + constw * consth);
    }
}
