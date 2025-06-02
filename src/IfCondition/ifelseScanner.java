package IfCondition;

import java.util.Scanner;

public class ifelseScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your age");

        int age = scanner.nextInt();

        if (age>18) {
            System.out.println("You can go");

        }
        else{
            System.out.println("you can not go");
        }
    }
}
