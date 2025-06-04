package StringBuffer_and_Builder;

public class Reverse_String {
    public static void main(String[] args) {

        String input = "mamta";

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }}