package homework_03_09_2022;

public class Task7 {
//    Пользователь вводит с клавиатуры два числа (начало и конец диапазона).
//    Требуется проанализировать все числа в этом диапазоне. Вывод на экран должен проходить по правилам, указанным ниже.
//    Если число кратно 3 (делится на 3 без остатка) нужно вывести слово «Fizz».
//    Если число кратно 5 нужно вывести слово «Buzz».
//    Если число кратно 3 и 5 нужно вывести «Fizz Buzz».
//    Если число не кратно не 3 и 5 нужно вывести само число.

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число начала диапазона!");
//        int num1 = scanner.nextInt();
//        System.out.println("Введите число конца диапазона!");
//        int num2 = scanner.nextInt();
//        int resultat = num2 - num1;
//        System.out.print("Диапазон = ");
//        int n = num1;
//        n++;

        for (int i = 1; i <= 50; i++) {

            if ( i % 15 == 0)   System.out.print(" " + "Fizz Buzz" + " ");  //if ((i % 3 == 0) && (i % 5 == 0))
            else if ((i % 3 == 0) && (i % 5 != 0))   System.out.print(" " + "Fizz" + " ");
            else if ((i % 5 == 0) && (i % 3 != 0))   System.out.print(" " + "Buzz" + " ");
            else    System.out.print(" " + i + " ");
        }

//        for (; n <= num2; ){
//        if ((i % 3 == 0) && (i % 5 != 0)) {
//                System.out.print(i + "\"Fizz\""); break; }
//        if ((i % 5 == 0 && (i % 3 != 0))) {
//                System.out.print(i + "\"Buzz\""); break;}
//        if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.print(i + "\"Fizz Buzz\""); break;}
//        else
//                System.out.print(i);
//            break;
    }
}
