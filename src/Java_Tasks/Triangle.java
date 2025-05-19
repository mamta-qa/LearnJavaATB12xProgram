package Java_Tasks;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.println("Enter the value of c: ");
        int c = scanner.nextInt();

        if ( a==b && b==c)
            System.out.println("This is an equilateral triangle and sides of the triangle are " + a + ", " + b + ", " + c);

        else if ( a==b || b ==c || c==a)

            System.out.println(" this is Isosceles " + a + "," + b +"," +c);

    else

                System.out.println(" this is scalene " + a + "," + b +"," +c);

            }}

