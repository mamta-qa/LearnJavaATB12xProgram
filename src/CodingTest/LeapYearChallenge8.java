package CodingTest;

import java.util.Scanner;

public class LeapYearChallenge8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter year");
        int year = scanner.nextInt();

        if ( (year % 4 == 0 && year % 100 != 0) || ( year % 400 ==0)){
            System.out.println(" This is leap year :"   +year);
        }
        else{
            System.out.println(" not leap year:  "  +year);
        }

    }

}
