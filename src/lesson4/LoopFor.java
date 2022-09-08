package lesson4;

public class LoopFor {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);

        System.out.println("===============");

        for(int i = 1; i <= 7; i = i + 1){
            System.out.println(i);
        }

        for (int i = 101; i <= 200; i = i + 10){
            System.out.print(i + " ");
        }

        int num = 10;
        System.out.println("increment = " + ++num);
        System.out.println("increment = " + num);

        System.out.println("decrement = " + num--);
        System.out.println("decrement = " + num);


        //вечный цикл
        for (int i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }

        System.out.println("==========");

        int num1 = 0;
        for (;num1 < 10;){
            System.out.print(num1 + " ");
            num1++;
        }
    }
}

