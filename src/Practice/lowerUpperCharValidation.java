package Practice;

import java.util.Scanner;

public class lowerUpperCharValidation {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter any single char : ");

        char ch = scanner.next().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println(" this is not a valid alphabet");
        }
        else if (Character.isUpperCase(ch)){
            System.out.println(" this is Uppercase alphabet");

        }
        else
            System.out.println(" This is LowerCase Alphabet");

    }

}
