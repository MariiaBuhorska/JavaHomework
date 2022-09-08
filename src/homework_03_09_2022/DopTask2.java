package homework_03_09_2022;

public class DopTask2 {
//Написать программу, которая выводит на экран все простые числа в диапазоне от 2 до 1 000 000.
// Наименьший делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n]

    public static void main(String[] args) {
        int num, del; //num - число; del - делитель числа
        boolean isPrime;
        System.out.print("Простые числа: ");
        for (num = 2; num <= 1_000_000; num++) {
            isPrime = true;
            for (del = 2; del <= num / del; del++)
                if ((num % del) == 0)
                    isPrime = false;
            if (isPrime)
                System.out.print(num + ", ");
        }
    }
}