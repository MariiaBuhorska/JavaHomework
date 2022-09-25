package practice;

public class lesson {
    //Напишите метод, который принимает два числа в качестве параметра и отображает все четные числа между ними.
    public static void main(String[] args) {

        onlyEven(24, 5);
    }

    public static void onlyEven(int a, int b) {
        for (int i = Math.min(a + 1, b); i < Math.max(a, b); i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
    }
}