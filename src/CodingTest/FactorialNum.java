package CodingTest;

import java.math.BigInteger;
import java.util.Scanner;


public class FactorialNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the number");

        int num = scanner.nextInt();
        BigInteger fact = BigInteger.ONE;
        int i= 1;
        if ( i<0)
        {
            System.out.println(" -ve num factorial is not available");

        }
        else{
            while( i<=num) {
                fact = fact.multiply(BigInteger.valueOf(i));
                i++;
            }
            System.out.println(" factorial of " +num+ " is " +  fact);

            }




    }
}
