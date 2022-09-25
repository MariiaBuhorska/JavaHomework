package homework_10_09_2022;

import java.util.Scanner;

public class DopTask3 {
    //Подсчитать среднюю длину слова, во введенном с клавиатуры предложении/
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите любое предложение!");
        String str = scanner.nextLine ();
        int count = 0;  //начальное количество слов
        if (str.length () != 0) {
            count++;
            //проверяем каждый символ на пробел
            for (int i = 0; i < str.length (); i++) {
                if (str.charAt (i) == ' ') {
                    count++;                 //если пробел количество слов + 1
                }
            }
        }
        System.out.println ("В предложении " + count + " слов");
        int wordLeigth = 0;
        for (int i = 0; i < str.length (); i++) {
            wordLeigth = str.length () / count;
        }
        System.out.println ("Длина строки равна " + str.length () + ". Средняя длина слова равна " + wordLeigth);
    }
}


