package CodingTest;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Number");
        int num = scanner.nextInt();

        System.out.println("Prime numbers between 1 and " + num + " are:");

        for( int i= 1; i<= num; i++){
            boolean isPrime = true;

            for ( int j=2; j<=i/2; j ++){
                if ( i %j ==0){
                    isPrime= false;
                    break;

                }
            }

            if ( isPrime)
            {
                System.out.println( "prime num is"  +i);

            }
            scanner.close();
        }

    }
}
