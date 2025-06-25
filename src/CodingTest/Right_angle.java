package CodingTest;

import org.w3c.dom.ls.LSOutput;

public class Right_angle {
    public static void main(String[] args) {
        //int i=5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}