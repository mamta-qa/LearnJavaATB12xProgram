package Java_Tasks;

import java.util.Scanner;

public class triangleClassifierInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("enter the value of b: ");
        int b = scanner.nextInt();

        System.out.println("enter the value of c: ");
        int c = scanner.nextInt();


        if (a == b && b == c) System.out.println(" Triangle is equilateral");
        else if (a == b || b == c || a == c) System.out.println(" Triangle is Isosceles");

        else System.out.println(" Triangle is scalene");

    }
}

