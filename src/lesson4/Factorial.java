package lesson4;
import java.util.Scanner;

public class Factorial {
    //Пользователь вводит с клавиатуры число.
    //Требуется посчитать факториал числа.
    //Например, если введено 3, факториал числа 1*2*3 = 6.
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите любое число!");
    int num = scanner.nextInt();
     int i = 1;
     int result = 1;
     while (i <= num){
     result = result*i;
      i++;}
      System.out.println("Факториал = " + result);
        }
    }