package practice;

import java.util.Scanner;

public class Task05Zodiac {

    public static String ulesanne_3(){
        System.out.println("В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов, обозначаемых названиями цвета: зеленый, красный, желтый, белый и черный. В каждом подцикле годы носят названия животных: крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и свиньи. По номеру года определить его название, если 1984 год — начало цикла: <год зеленой крысы>.\n" +
                "");
        int Y;
        String result ="";
        Scanner in = new Scanner(System.in);
        System.out.println("Write Year ");
        Y = in.nextInt();
        int animal = Y%12;
        int color = Y%10;
        switch (color){
            case 0: result = "Белый ";
                break;
            case 1: result = "Белый ";
                break;
            case 2: result = "Черный ";
                break;
            case 3: result = "Черный ";
                break;
            case 4: result = "Синий ";
                break;
            case 5: result = "Синий ";
                break;
            case 6: result = "Красный ";
                break;
            case 7: result = "Красный ";
                break;
            case 8: result = "Желтый ";
                break;
            case 9: result = "Желтый ";
                break;
        }
        switch (animal){
            case 0 : result += "обезьяна ";
                break;
            case 1: result += "петух ";
                break;
            case 2: result += "собака ";
                break;
            case 3: result += "свинья ";
                break;
            case 4: result += "крыса ";
                break;
            case 5: result += "бык ";
                break;
            case 6: result += "тигр ";
                break;
            case 7: result += "заяц ";
                break;
            case 8: result += "дракон ";
                break;
            case 9: result += "змея ";
                break;
            case 10: result += "лошадь ";
                break;
            case 11: result += "овца ";
                break;
        }
        System.out.println(result);
        return null;

    }
}
