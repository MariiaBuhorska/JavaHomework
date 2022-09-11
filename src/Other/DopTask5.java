package Other;

import java.util.Scanner;

public class DopTask5 {
    //     Напишите программу, которая будет проверять, является ли число, введенное с клавиатуры палиндромом (одинаково читающееся в обоих направлениях).
//     Например, 123454321 или 221122 – палиндром.
//     Программа должна вывести YES, если число является палиндромом, и NO – в противоположном случае.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое многозначное число!");
        int number = scanner.nextInt();
        int[] array = new int[number];
        System.out.println(number);
        boolean itstrue = true;
            for (int i = 0; i < array.length - 1; i++) {
                int left = i - 1;
                int right = i + 1;
                if (left == right) {
                System.out.print("YES");


//        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
//            if (i == j)
//                System.out.println("YES!");

//            if (!(array[i] == array[j])) {
//                istrue = false;
//                System.out.println("NO");
//                break;}
//        }
//        if (istrue) {
//            System.out.println("YES!");
            }
        }
    }
}


