package CodingTest;

public class CodingChallenge5 {
    public static void main(String[] args) {
        int a=5, b=3,c=2;
        int result1 = a+b*c; //
        int result2 = (a + b) * c;

        System.out.println("a+b*c   ="  +result1 );
        System.out.println("(a + b) * c   ="  +result2 );
          int  result3= a + b - c * b / c;
        System.out.println( "a + b - c * b / c   ="   +result3);


        int intVal = 100;
        double doubleval = intVal;
        System.out.println("Implicit Type Casting:");

        System.out.println("double doubleVal = intVal;");
        System.out.println("doubleval = " + doubleval + " // int automatically promoted to double");

                double Price = 99.90;
                int roundPrice =(int)Price;
        System.out.println("\nExplicit Type Casting:");
        System.out.println("double price = 99.99;");

        System.out.println(" int roundPrice =(int)Price");
        System.out.println("roundPrice = " + roundPrice + " // int automatically truncate the round price");

        double mixResult = 5+2.5;
        System.out.println("mixed type expression");
        System.out.println("double mixResult = 5 + 2.5;");
        System.out.println("mixResult = " + mixResult + " // 5 is cast to 5.0, then added to 2.5");


        int exprCast = (int)(10 + 2.5);
        System.out.println("\nCasting Entire Expression:");
        System.out.println("int exprCast = (int)(10 + 2.5);");
        System.out.println("exprCast = " + exprCast + " // Result is 12.5, cast to 12");











    }
}
