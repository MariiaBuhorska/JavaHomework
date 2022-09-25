package homework_12_09_2022;

public class Task9 {
    //Написать программу, проверяющую является ли одна строка анаграммой для другой строки (строка может состоять
    //из нескольких слов и символов пунктуации). Пробелы и пунктуация должны игнорироваться при анализе. Разница
    //в больших и маленьких буквах должна игнорироваться. Обе строки должны вводиться с клавиатуры. Программа должна
    //выводить Yes, если строки являются анаграммой, и No – иначе.  // Пример анаграммы в стихах:
    //Строка 1 «Аз есмь строка, живу я, мерой остр».
    //Строка 2 «За семь морей ростка я вижу рост!»

    public static void main (String[] args) {
        //     Scanner scanner = new Scanner (System.in);
        //System.out.println ("Для проверки является ли одна строка анаграммой для другой строки, введите первую строку!");
//
        //     scanner.hasNextLine ();
//        String str = scanner.nextLine (); //«Аз есмь строка, живу я, мерой остр».
//
//        System.out.println ("Введите вторую строку!");
//        String str1 = scanner.nextLine ();  //За семь морей ростка я вижу рост!
//        String str4 = "За семь морей ростка я вижу рост!";

//        String str3 = "Аз есмь строка, живу я, мерой остр.";
//        System.out.println (str3);
//        String str4 = "За семь морей ростка я вижу рост!";
//        System.out.println (str4);
//        boolean b = str3.equalsIgnoreCase (str4);
//        System.out.println (str3.describeConstable ().get ());
//        System.out.printf ((str3) + "%n");

        String str1 = "Аз есмь строка, живу я, мерой остр.";
        String str2 = "За семь морей ростка я вижу рост!";
        String news = str1.toUpperCase ().replace (",", "").replace (".", "");
        String news2 = str2.toUpperCase ().replace ("!", "");
       // boolean result = news.regionMatches (0, news2, 0, news.length ());
        System.out.println (news.compareTo (news2));
        System.out.println (news);
        System.out.println (news2);


      //  System.out.println (result);
        // System.out.println (anagram);
//        char[] arr = str1.toCharArray ();
//        char[] arr1 = str2.toCharArray ();
//
//        System.out.println (" 2 " + str1.equalsIgnoreCase (str2));

    }
}

//        String reversed = "";
//        for (int i = arr.length - 1; i >= 0; i--) {
//            reversed = reversed + arr[i];
//        }
//
//        System.out.println (" 1 " + reversed);
//    }
//}
//        char[] array = str3.toCharArray ();
//        char[] array1 = str4.toCharArray ();
//
//        System.out.println ("Рузультат поворота строк = " );
//        int i = array.length - 1;
//        while (i >= 0) {
//            i--;}
//
//        System.out.println (array[i]);
//
//        int j = array1.length - 1;
//        while (j >= 0) {
//            j--;

//   System.out.println (array1 [j]);


//  String.valueOf (scanner.nextLine ().compareToIgnoreCase (str));


//        System.out.println (str1);
//        System.out.println ("Yes");


