package Practice;

import java.util.Scanner;

public class letterOrDigit
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter anything");

        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("it is an alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("it is a digit");

        } else {
            System.out.println("special character");
        }
    }}
