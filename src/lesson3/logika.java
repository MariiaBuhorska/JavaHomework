public class logika {
    public static void main(String[] args) {
        int first = 13, second = 54;
        if (first!=second){
            System.out.println("It is Ok");
 }
        if (first==second){
            System.out.println("It is Ok");
        }
        if (first>second){
            System.out.println("It is Ok");
        }
        if (first<second){
            System.out.println("It is Ok");
        }
        char ch1 = 'A', ch2 = 'B';
        if (ch1 <= ch2){
            System.out.println("Is realy bigger?");
        }
        int num = 7;
        if (num >= 0 && num <= 10){
            System.out.println("It's OK");
        }
        int num1 = 8;
        if (num >= 0 || num <= 10){
            System.out.println("It's OK");
        }
    }
}