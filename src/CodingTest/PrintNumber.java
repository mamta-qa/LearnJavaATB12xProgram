package CodingTest;

import javax.swing.*;

public class PrintNumber {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i <= num; i++) {
            if (i < 5)
                System.out.print(+i + ",");
            else {
                System.out.println(i);

            }
        }
    }
}

