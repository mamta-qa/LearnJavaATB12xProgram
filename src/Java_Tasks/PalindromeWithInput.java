package Java_Tasks;

import java.util.Scanner;

public class PalindromeWithInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter a string");
        String orignal = scanner.nextLine();
        String reveresed= "";

        for( int i= orignal.length()-1; i>=0; i--) {
            reveresed += orignal.charAt(i);
        }
            if (orignal.equals(reveresed)) {


                System.out.println("string is palindrome: " + reveresed);
            }
            else
            {
                System.out.println(" not palindrome");
            }
        }
    }

