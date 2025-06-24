package CodingTest;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println(" Enter first number ");
        double a = sc.nextDouble();

        System.out.println(" Enter second number");
        double b = sc.nextDouble();

        System.out.println(" Enter operator (+, -, *, /):");
        char op = sc.next().charAt(0);


        switch (op) {

            case '+' :
                System.out.println(" Result :"   +(a+b)  );
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if ( b==0)
                    System.out.println(" can not div by zero");

                else
                    System.out.println(" result  "  +(a/b));
                break;
                    default:
                    System.out.println("invalid operator");

        }
sc.close();
    }
}
