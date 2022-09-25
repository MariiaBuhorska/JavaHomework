package String_exx;

public class sotr_charArray {
    public static void main (String[] args) {

        String str1 = "Аз есмь строка, живу я, мерой остр.";
        char[] arr = str1.toCharArray ();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Character.toLowerCase (arr[j]) < Character.toLowerCase (arr[i])) {
                    swapChars (i, j, arr);
                }
            }
        }
        System.out.println ("Sorted string " + String.valueOf (arr));
    }

    private static void swapChars (int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



