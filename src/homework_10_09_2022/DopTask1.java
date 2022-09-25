package homework_10_09_2022;

import java.util.Scanner;

public class DopTask1 {
    //Ввести с клавиатуры строку текста, а затем один символ.
    //Показать на консоль индексы и количество совпадений (ищем вхождения символа в строку).
    // В случае если совпадений не найдено, вывести соответствующий текст.
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите строку текста!");
        String str = scanner.nextLine ();
        System.out.println ("Введите любой символ!");
        String strSymbol = scanner.nextLine ();
        int index = str.toLowerCase ().indexOf (strSymbol);
        int count = 0;
        if (index == -1) {
            System.out.println ("Совпадений не найдено!");
        }
        System.out.print ("Индексы символа " + strSymbol + " = ");
        while (index != -1) {
            System.out.print (index + " ");
            index = str.indexOf (strSymbol, index + 1);
            count++;
        }
        System.out.print (". Количество совпадений символа " + strSymbol + " в тексте = " + count);
    }
}





