package Strings;

public class String_example3 {
    public static void main(String[] args) {

        String s= "java".substring(2);
        System.out.println(s);
        String m ="java".substring(1);
        System.out.println(m);
        String st = "             java  ".trim();
        System.out.println(st);

        boolean b =" ".isBlank();
        System.out.println(b);


        String s2= "ab".repeat(3);
        System.out.println(s2);

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        String sb1 =String.format("%s = %d", "age" ,25);
        System.out.println(sb1);

        long count ="a\nb\nc\tc".lines().count();
        System.out.println(count);

    }
}
