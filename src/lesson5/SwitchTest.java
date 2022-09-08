package lesson5;

public class SwitchTest {
    public static void main(String[] args) {
        String month = "April";

        switch (month) {
            case "April":
                System.out.println("Spring");
                break;
            case "May":
                System.out.println("Spring");
                break;
            case "March":
                System.out.println("Spring");
                break;
        }
        switch (month) {
            case "April", "May", "March" -> System.out.println("Spring");
            case "June" -> System.out.println("Summer");
        }
        String str1 = "Hello";
        String str2 = "hello";
           }
}