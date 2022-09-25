package homework_29_08_2022;

public class Task10 {
    //Определить номер подъезда девятиэтажного дома, по указанному номеру квартиры N.
    // Считать, что на каждом этаже находится M квартир. Вывести в консоль номер подъезда.
    public static void main(String[] args) {
        double N = 82;
        double M = 3;
        final double level = 5;
        double number = (N / (M * level));
        if (N == 0) {
            System.out.println("Ошибка ввода!");}
        else if ((Math.round(number)) <= 1) {
            System.out.println("В доме всего один подъезд!");}
        else if (number > 1) {
            System.out.println("Номер подъезда - " + Math.round(number));}
    }
}