package homework_29_08_2022;

public class Task4 {
    //Дана точка на плоскости заданная координатами x и y,
    //определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
    //Четверти обозначены римскими цифрами
    public static void main(String[] args) {
        int x = 0;
        int y = -1;
        if (x >0 && y >0){
            System.out.println("Точка находится I четверти");}
        else if (x < 0 && y > 0){
            System.out.println("Точка находится во II четверти");}
        else if (x < 0 && y < 0){
            System.out.println("Точка находится в III четверти");}
        else if (x > 0 && y < 0){
            System.out.println("Точка находится в IV четверти");}
        else if (x==0 && y==0){
            System.out.println("Ошибка!");}
        else
            System.out.println("Попробуй еще разок!");
        }
    }
