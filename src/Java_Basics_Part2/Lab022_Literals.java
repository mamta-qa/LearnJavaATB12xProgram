package Java_Basics_Part2;

import java.sql.SQLOutput;

public class Lab022_Literals {
    public static void main(String[] args) {
        char A1 = 'A'; // A-Z
        char A2 = '@'; //special chr
        char A3 = '1'; // digits
        char A4 = '(';
        char A5 = ' '; // space


        // Escape chr
        char new_line = '\n'; //new line
        char tab_line = '\t';//tab
        char back_space = '\b'; //backspace
        char carriage_return = '\r'; //remove last

        System.out.println(" Mamta Dhiman\nSoftware Tester");
        System.out.println(" Mamta Dhiman\tSoftware Tester");
        System.out.println(" Mamta Dhiman\bSoftware Tester");
        System.out.println(" Mamta Dhiman\rSoftware Tester" );

        System.out.println("Hi, This is a First line"+new_line+"This is second line \nThis is third line");



    }}
