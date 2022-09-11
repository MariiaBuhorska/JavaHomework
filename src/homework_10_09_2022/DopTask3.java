package homework_10_09_2022;

import java.util.Scanner;

public class DopTask3 {
    //Подсчитать среднюю длину слова, во введенном с клавиатуры предложении/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое предложение!");
        String str = scanner.nextLine();



        // char [] Words = str.toLowerCase().toCharArray();
        String[] Words = str.split(" ");
        //System.out.println(Arrays.toString(Words));
        for (String slova : Words) {
            System.out.println(slova);
            // System.out.println("Длина строки  \n" + Arrays.toString(Words) + " равна " + Words.length);


            // System.out.println("Всего слов в предложении " +  ". " + "Средняя длина слова = ");
        }
    }
}
