package homework_10_09_2022;

import java.util.Scanner;

public class DopTask2 {
    //Написать программу, которая создаст строку, в которой находятся все целые числа, начиная с 1, выписаны в одну
    //строку «123456789101112131415...». Строка должна быть длиной не более 1 000 символов.
    //По числу n (введенного с клавиатуры), выведите цифру на n-й позиции (используется нумерация с 1).
    public static void main (String[] args) {
        String str = "";
        for (int i = 1; str.length () < 1000 ; i++) {
                str += i;
        }
        System.out.print (str);
        Scanner scanner = new Scanner (System.in);
        System.out.println ("\nВведите любое число!");
        int num = scanner.nextInt ();
        System.out.println ("Ваша цифра = " + str.charAt (num));
    }
}
