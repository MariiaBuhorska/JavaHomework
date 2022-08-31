package homework_29_08_2022;

import java.util.Scanner;

public class Task5 {
    //Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
    //года по китайскому календарю.
    //Пример входных данных:
    //5 12 1974
    //Вывод:
    //Знак: Стрелец
    //Год: Тигра
    public static void main(String[] args) {
        int day;
        int month;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день Вашего рождения!");
        day = scanner.nextInt();
        System.out.println("Введите месяц Вашего рождения!");
        month = scanner.nextInt();
        System.out.println("Введите год Вашего рождения!");
        int year = scanner.nextInt();
        int animal = year%12;

        String zooyears = Integer.toString(year);
        switch (animal) {
            case 0:
                zooyears = "Год Обезьяны";
                break;
            case 1:
                zooyears = "Год Петуха";
                break;
            case 2:
                zooyears = "Год Собаки";
                break;
            case 3:
                zooyears = "Год Свиньи";
                break;
            case 4:
                zooyears = "Год Крысы";
                break;
            case 5:
                zooyears = "Год Быка";
                break;
            case 6:
                zooyears = "Год Тигра";
                break;
            case 7:
                zooyears = "Год Кролика";
                break;
            case 8:
                zooyears = "Год Дракона";
                break;
            case 9:
                zooyears = " Год Змеи";
                break;
            case 10:
                zooyears = "Год Лошади";
                break;
            case 11:
                zooyears = "Год Козы";
                break;}
        System.out.println("Ваш год: " + zooyears);

        String znak = Integer.toString(month, day);
        switch (month) {
            case 1: {
                if (day < 20) znak = "Козерог";
                else znak = "Водолей";
                break;
            }
            case 2: {
                if (day < 19) znak = "Водолей";
                else znak = "Рыбы";
                break;
            }
            case 3: {
                if (day < 21) znak = "Рыбы";
                else znak = "Овен";
                break;
            }
            case 4: {
                if (day < 20) znak = "Овен";
                else znak = "Телец";
                break;
            }
            case 5: {
                if (day < 21) znak = "Телец";
                else znak = "Близнецы";
                break;
            }
            case 6: {
                if (day < 22) znak = "Близнецы";
                else znak = "Рак";
                break;
            }
            case 7: {
                if (day < 23) znak = "Рак";
                else znak = "Лев";
                break;
            }
            case 8: {
                if (day < 23) znak = "Лев";
                else znak = "Дева";
                break;
            }
            case 9: {
                if (day < 23) znak = "Дева";
                else znak = "Весы";
                break;
            }
            case 10: {
                if (day < 23) znak = "Весы";
                else znak = "Скорпион";
                break;
            }
            case 11: {
                if (day < 23) znak = "Скорпион";
                else znak = "Стрелец";
                break;
            }
            case 12: {
                if (day < 22) znak = "Стрелец";
                else znak = "Козерог";
                break;
            }
        }
        System.out.println("Знак зодиака: " + znak);
    }
}
