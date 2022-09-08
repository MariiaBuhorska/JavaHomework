package homework_03_09_2022;

import java.io.IOException;
import java.util.Scanner;

    public class Task6 {
//Пользователь вводит с клавиатуры длину линии и символ для заполнения линии.
// Нужно отобразить на экране вертикальную линию из введенного символа, указанной длины.

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите символ вертикальной линии");
            char symbol = (char) System.in.read();
            System.out.println("Введите число, обозначающее длину вертикальной линии");
            int num = scanner.nextInt();
            System.out.println("Символ линии = " + symbol + " Длина линии = " + num);

            for (int i = 0; i < num; i++) {
                System.out.println(symbol);
        }
     }
}
