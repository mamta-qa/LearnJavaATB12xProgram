package Strings;

import org.w3c.dom.ls.LSOutput;

public class StringExample4 {
    public static void main(String[] args) {


    String s= "java";
    char c = s.charAt(2);
    System.out.println(c);

        System.out.println(s.codePointAt(0));

        int idx = "java".indexOf("a");
        System.out.println(idx);

        int idx1 ="java".lastIndexOf("a");


        boolean b="".isEmpty();
        System.out.println(b);

        String s11 = String.join(" z-"," java","python");
        System.out.println(s11);

        String s12 = "java".replace('a','o');
        System.out.println(s12);
        boolean b1 ="java".startsWith("aa");
        System.out.println(b1);

}}
