package homework_12_09_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    // Пользователь вводит с клавиатуры любую строку.
    // Поменять в исходной строке все большие буквы на маленькие, а маленькие – на большие.
    // Если в строке присутствуют цифры, заменить на символ подчеркивания и вывести результат на консоль.
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите любую строку!");
        scanner.hasNextLine ();
        String str = scanner.nextLine ();
       // char[] arr = str.toCharArray ();
        char [] arr = new char[str.length ()];
        str.getChars(0, str.length (), arr, 0);
        int i = 0; char cgft = ' ';
        for (i = 0; i < str.length (); i++) {
            if (Character.isLowerCase (str.charAt (i))) {
                cgft = arr [i];
                System.out.print (Character.toUpperCase (str.charAt (i)));
            } else if (Character.isUpperCase (str.charAt (i))) {
                cgft = arr [i];
                System.out.print (Character.toLowerCase (str.charAt (i)));
            } else if (Character.isSpaceChar (str.charAt (i))) {
                cgft = arr [i];
                System.out.print (" ");
            } else if (Character.isDigit (str.charAt (i))) {
                cgft = arr [i];
                System.out.print ("_");
            } else if (!Character.isAlphabetic (str.charAt (i))) {
                cgft = arr [i];
                System.out.print (str.charAt (i));
            }
            System.out.print ("");
        }
            System.out.println (i);
        char [] chararr = new char[i];

        System.out.println (Arrays.toString (chararr));
    }
}
