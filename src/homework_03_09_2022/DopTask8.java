package homework_03_09_2022;

public class DopTask8 {
    //Электронные часы показывают время в формате от 00:00 до 23:59.
    // Написать программу, которая выведет на консоль сколько раз за сутки случается так,
    // что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
    // Вывести на экран все симметричные комбинации. Вывести общее число комбинаций.
    public static void main(String[] args) {
        int maxHour = 23, maxMinute = 59;
        int hour = 0;
        int minute = 0;
        int count = 0;                     // count - количество симметричных комбинаций

        while (hour <= maxHour) {
            minute = 0;
            while (minute <= maxMinute) {
                if (hour == (minute % 10) * 10 + (minute / 10) % 10) {
                    count++;
                    System.out.print(" " + hour + " : " + minute + "\n");
                }
                minute++;
            }
            hour++;
        }
        System.out.println("Всего " + count + " комбинаций");
    }
}
