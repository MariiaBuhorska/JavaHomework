package homework_29_08_2022;

public class Task8 {
    //Даны два числа x и y. Программа должна вывести в консоль YES, – если оба числа четные, либо оба числа нечетные;
    //иначе программа ничего не выводит
    public static void main(String[] args) {
        int x = 22;
        int y = 10;
        if ((x % 2 == 0) && (y % 2 == 0)) {
            System.out.println("YES");
        }
        if ((x % 2 != 0) && (y % 2 != 0)) {
            System.out.println("YES");
        }
    }
}
