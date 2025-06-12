package Array;

public class SumofArray {
    public static void main(String[] args) {
        int numbers[]= { 11,22,33};
        int sum=0;
        for( int i=0 ; i<  numbers.length; i++)
        {
            sum= sum+numbers[i];
        }
        System.out.println("Sum is: " +sum);
    }
}
