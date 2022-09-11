package homework_03_09_2022;

public class DopTask9 {
    //Если перечислить все натуральные числа меньше 10, кратные 3 или 5, мы получаем 3, 5, 6 и 9.
    // Сумма этих кратных – 23. Найдите сумму всех чисел, кратных 3 или 5, начиная с 0 и до 1 000.

    public static void main(String[] args) {
        int summa3 = 0;
        for (int count = 0; count < 1000; count = count + 3) {
            int i = count;
            summa3 += i;
            if (i % 3 == 0 && i % 5 != 0) ;
        }
        int summa5 = 0;
        for (int count1 = 0; count1 < 1000; count1 = count1 + 5) {
            int j = count1;
            summa5 += j;
            if (j % 5 == 0 && j % 3 != 0) ;
        }
        int summa = summa3 + summa5;
        System.out.print("Cумма всех чисел, кратных 3 или 5, начиная с 0 и до 1 000 = " + summa);
    }
}

