package homework_29_08_2022;

public class Task10 {
    //Определить номер подъезда девятиэтажного дома, по указанному номеру квартиры N.
    // Считать, что на каждом этаже находится M квартир. Вывести в консоль номер подъезда.
    public static void main(String[] args) {
        double N = 145;
        double M = 9;
        final double level = 9;
        double number = (N / (M * level));
        if (N == 0) {
            System.out.println("Ошибка ввода!");}
        else if ((Math.round(number)) <= 1) {
            System.out.println("В доме всего один подъезд!");}
        else if (number > 1) {
            System.out.println("Номер подъезда - " + Math.round(number));}
    }
}