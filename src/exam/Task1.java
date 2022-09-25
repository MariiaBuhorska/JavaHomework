package exam;

public class Task1 {
    //Напечатать таблицу умножения на 7 в обратном порядке:
    //        9 х 7 = 63
    //        1 х 7 = 7

    public static void main (String[] args) {
        for (int i = 9, y = 7; i >= 1; i--) {
            int multiplicationResult = i * y;
            System.out.println (i + " x " + y + " = " + multiplicationResult);
        }
    }
}