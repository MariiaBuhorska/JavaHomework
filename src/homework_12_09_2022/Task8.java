package homework_12_09_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    //Вам требуется написать программу, которая преобразует
//переменную, записанную на одном языке, в формат другого
//языка. Идентификатор (имя) переменной должен вводится с
//клавиатуры. Программа должна определить, из какого языка
//взята переменная, и переделать ее в переменную другого
//языка. Вывести результат на консоль
//longAndMnemonicIdentifier     long_and_mnemonic_identifier
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите идентификатор (имя) переменной!");
        String variableName = scanner.nextLine ();
        char [] javaLanguage = variableName.toLowerCase ().toCharArray ();
        char [] cLanguage = variableName.toLowerCase ().toCharArray ();
        System.out.println ("javaLanguage " + Arrays.equals (javaLanguage, cLanguage));


    }
}

//                String.format (variableName, )
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isLowerCase(str.charAt(i))) {
//                System.out.print(Character.toUpperCase(str.charAt(i)));
//            } else if (Character.isUpperCase(str.charAt(i))) {
//                System.out.print(Character.toLowerCase(str.charAt(i)));
//            } else if (Character.isSpaceChar(str.charAt(i))) {
//                System.out.print(" ");
//            } else if (Character.isDigit(str.charAt(i))) {
//                System.out.print("_");
//            } else if (!Character.isAlphabetic(str.charAt(i))) {
//                System.out.print(str.charAt(i));
//            }
//        }
//        System.out.println();
//        System.out.println(str);
//    }
//}



