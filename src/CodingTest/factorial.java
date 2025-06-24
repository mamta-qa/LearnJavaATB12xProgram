package CodingTest;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int num = scanner.nextInt();
        long fact = 1;
        int i = 1;

        if (num < 0) {
            System.out.println("Factorial is not allowed for negative numbers.");
        } else {
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }

        scanner.close();
    }
}