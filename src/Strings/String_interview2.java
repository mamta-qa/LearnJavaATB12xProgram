package Strings;

import java.sql.SQLOutput;

public class String_interview2
{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s5);
        System.out.println(s4 == s2);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s1 == s4);



        System.out.println(s2 == s3);


        System.out.println(s3.equals(s5));
        System.out.println(s3.compareToIgnoreCase(s5));

    }
}
