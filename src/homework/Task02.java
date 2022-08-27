package homework;
public class Task02 {
    //В переменной n хранится натуральное (целое) трехзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n
    public static void main(String[] args) {
    int n = 155;
    int hundreds = n / 100;
        System.out.println("Cотни = " + hundreds);
    int tens = (n / 10) % 10;
        System.out.println("Десятки = " + tens);
    int ones = n % 10;
        System.out.println("Единицы = " + ones);
        System.out.println("Cуммa цифр числа n = " + (hundreds + tens + ones));
           }
}
