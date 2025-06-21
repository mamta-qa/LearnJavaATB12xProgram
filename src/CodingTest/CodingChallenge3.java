package CodingTest;

public class CodingChallenge3 {
    public static void main(String[] args) {


        int a = 10;
        int b = 12;
        int c = 10;
        {

            // Use comparison operators (==, !=, <, >, <=, >=)
            // Use logical operators (&&, ||, !) - Print boolean results with explanatory messages
            System.out.println(" compare");
            System.out.println(" a==c  :" + (a == c));
            System.out.println(" a !=c  :" + (a != c));
            System.out.println(" a< b : " + (a < b));
            System.out.println(" a > b : " + (a > b));
            System.out.println(" a <= b : " + (a <= b));
            System.out.println(" a>= b : " + (a >= b));
            System.out.println(" Logical Operators");
            boolean condition1 = (a == c);
            boolean condition2 = (b == c);

            System.out.println(" Condition1 && Condition2 " + (condition1 && condition2));
            System.out.println(" Condition1 || Condition2 " + (condition1 || condition2));
            System.out.println(" Condition1 != Condition2 " + (condition1 != condition2));


        }
    }
}