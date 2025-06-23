package CodingTest;

import java.util.Scanner;

public class CodingChallenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the digit:  ");
        String input = scanner.nextLine();

        if (input.matches("-?\\d+")) {


            int num = Integer.parseInt(input);

            if (num > 0) {
                System.out.println(" number is positive   " + num);
            } else if (num < 0) {
                System.out.println("num is neagative  " + num);
            } else {
            System.out.println(" number is zero : " + num);
        }}
else{
                System.out.println(" not valid ");


            }
        }
    }

