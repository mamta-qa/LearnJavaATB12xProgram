package CodingTest;

import java.util.Scanner;

public class codingchallenge7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter first num");
        String input1 = scanner.nextLine();

        System.out.println(" enter second num");
        String input2 = scanner.nextLine();

        System.out.println("enter third number");
        String input3 = scanner.nextLine();


        if (!input1.matches("-?\\d+") || !input2.matches("-?\\d+") || !input3.matches("-?\\d+")){
            System.out.println("Invalid input! Please enter digits only.");
    }
    else

    {
        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);
        int c = Integer.parseInt(input3);


        if ( a==b && b==c) {
            System.out.println(" all number are equal " + a);
        }
            else if  ( a>=b && a>=c){
                if ( a== b || a == c){
                System.out.println("Two numbers are equal and largest: " + a);
            }
            else if (b >= c &&  b >= c) {
                    if (( b== c)){
        }
                    System.out.println("Two numbers are equal and largest: " + b);
                } else {
                    System.out.println("The largest number is: " + b);
            }
        }
     else {
        System.out.println("The largest number is: " + c);
    }

        scanner.close();
}
}}


