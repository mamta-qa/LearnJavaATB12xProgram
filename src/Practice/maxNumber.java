package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number1 " );
        int n1 = scanner.nextInt();

        System.out.println("enter number2 " );
        int n2 = scanner.nextInt();

        System.out.println("enter number3 " );
        int n3 = scanner.nextInt();

        if (n1>n2 && n1>n3)
            System.out.println("n1 is maximum : " +n1 );

        else if  (n2>n1 && n2>n3)
            System.out.println("n2 is maximum : " +n2 );


        else
            System.out.println("n3 is maximum : " +n3);

    }
}
