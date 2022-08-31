package lesson2;
import java.util.Scanner;
public class EnterData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Привет, как дела?");
       String answer = scan.nextLine();
        System.out.println("Вы ответили: "+ answer);
        System.out.println("Сколько вам лет?");
        int age = scan.nextInt();
        System.out.println("Ваш возраст = " + age);
        System.out.println("Какой Ваш вес?");
        double weight = scan.nextDouble();
        System.out.println("Ваш вес:" + weight);
        System.out.println("Я не робот");
        boolean human = scan.nextBoolean();
        System.out.println("Вы не робот = " + human);
        System.out.println("Оставьте свой отзыв!");
        String otziv = scan.next();
        System.out.println("Вы ответили: " + otziv);



    }
}
