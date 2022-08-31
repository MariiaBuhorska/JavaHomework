package homework;
public class Task01 {
    //В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
    //■ результат целочисленного деления x на y;
    //■ остаток от деления x на y;
    //■ квадратный корень x
    public static void main(String[] args) {
    int x = 120;
    int y = 20;
        System.out.println("Результат целочисленного деления x на y = " + x / y);
        System.out.println("Остаток от деления x на y = " + x % y);
        System.out.println("Квадратный корень x = " + Math.sqrt(x));
           }
}
