package homework_03_09_2022;

public class DopTask3 {
    //Самовлюблённое число или число Армстронга – натуральное число, которое равно сумме своих цифр,
    // возведенных в степень, равную количеству его цифр.
    //Показать на экране все числа Армстронга в диапазоне от 10 до 1 000 000.
    // 153 = 1\3+ 5\3+ 3\3
    public static void main(String[] args) {
        int arms, number, digit, summa;
        arms = 10;
        System.out.print("Числа Армстронга в заданном диапазоне = ");

        for (; arms < 1000000; arms++) {
            number = arms;

            summa = 0;

            while (number != 0) {
                digit = number % 10;
                summa = summa +  (digit * digit * digit);
                number /= 10;
                if (summa == arms)
                    System.out.print(arms + " ");
            }
        }
    }
}



