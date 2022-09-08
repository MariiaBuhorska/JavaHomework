package homework_03_09_2022;

public class DopTask11 {
    //Напишите программу, которая выводит на экран числа от 1 до 1 000. При этом вместо чисел, кратных трём,
    // программа должна выводить слово fizz, а вместо чисел, кратных пяти – слово buzz.
    // Если число кратно пятнадцати, то программа должна выводить вместо числа слово hiss.
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {

            if (i % 15 == 0) {
                System.out.print(" " + "hiss" + " ");
            } else if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.print(" " + "fizz" + " ");
            } else if ((i % 5 == 0) && (i % 3 != 0)) {
                System.out.print(" " + "buzz" + " ");
            } else
                System.out.print(" " + i + " ");
        }
    }
}
