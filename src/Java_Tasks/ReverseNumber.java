package Java_Tasks;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 12345;
        int rev = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;


        }
        System.out.println(" rev number is :" + rev);
    }
}