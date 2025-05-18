package ex_06_Ternary_Operators;

public class TO_P2 {
    public static void main(String[] args) {
        int number = 19;


        String result = (number > 18) ? (number > 25 ? " you can drink" : " you can not drink") : " you can not go to Goa";
        System.out.println(result);
    }}
