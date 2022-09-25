//package homework_10_09_2022;
//
//public class DopTask11 {
//}
/*11. Напишите программу, печатающую все перестановки строки.
Это непростой вопрос, и мы должны использовать рекурсию для нахождения всех перестановок строки, например перестановками “AAB” могут быть “AAB”, “ABA” и “BAA”.

Также нам необходимо использовать Set для того, чтобы убедиться, что у нас нет дубликатов строк.

Для получения всех перестановок, мы для начала берем первый символ строки и переставляем оставшиеся символы.

Если String = “ABC”
Первый символ char = A и оставшиеся перестановки BC и CB.
Теперь мы можем вставить первый символ в доступные позиции в перестановках.
BC -> ABC, BAC, BCA
CB -> ACB, CAB, CBA

Пример программы:

import java.util.HashSet;
import java.util.Set;

public class StringHelper {
    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // первый символ
        String rem = str.substring(1); // полная строка без первого символа
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args) {
        String s = "AAC";
        String s1 = "ABC";
        String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
    }
}

Вывод программы:

Permutations for AAC are:
[AAC, ACA, CAA]

Permutations for ABC are:
[ACB, ABC, BCA, CBA, CAB, BAC]

Permutations for ABCD are:
[DABC, CADB, BCAD, DBAC, BACD, ABCD, ABDC, DCBA, ADBC, ADCB, CBDA, CBAD, DACB, ACBD, CDBA, CDAB, DCAB, ACDB, DBCA, BDAC, CABD, BADC, BCDA, BDCA]

 */

