package exam;

public class Task2 {
    //Используя цикл while необходимо вывести на экран следующую последовательность чисел:
    // 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    public static void main (String[] args) {
        int numbers = 7;
        while (numbers <= 98) {
            System.out.print (numbers + " ");
            numbers += 7;
        }
    }
}
