package homework_29_08_2022;

import java.util.Scanner;

public class Task1 {
    //Написать программу, которая предлагает пользователю
    //ввести c клавиатуры номер дня недели, и в ответ показывает название этого дня (например, 6 – это суббота).
    // Решить с использованием switch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int answer = scanner.nextInt();
        String answerString = Integer.toString(answer);
        switch (answer) {
            case 1:   answerString = "Понедельник";
                break;
            case 2:  answerString = "Вторник";
                break;
            case 3:  answerString = "Среда";
                break;
            case 4:  answerString = "Четверг";
                break;
            case 5:  answerString = "Пятница";
                break;
            case 6:  answerString = "Суббота";
                break;
            case 7:  answerString = "Воскресенье";
                break;
            default: answerString = "Нет такого дня недели. Попробуй еще раз!";
            break;}
            System.out.println("Сегодня... " + answerString);
    }
    }
