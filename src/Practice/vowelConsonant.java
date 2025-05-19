package Practice;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any single chr : ");
        char ch = scanner.next().charAt(0);

         ch = Character.toLowerCase(ch);



        if (!Character.isLetter(ch)) {
            System.out.println("not a valid  character");
        }
            else if
                ( ch == 'a' ||ch == 'e' || ch == 'o' || ch =='u'|| ch == 'i' ) {
            System.out.println(" character is vowel " +ch);
        }
            else{
            System.out.println(" character is consonant " +ch);
        }}}


