package Java_Tasks;

public class Palindrome {
    public static void main(String[] args) {
        String orignal ="madam";
        String reversed = "";

        for ( int i= orignal.length()-1; i>=0; i--){
            reversed+= orignal.charAt(i);
        }
        if (orignal.equals(reversed))
            System.out.println(" string is palindrom " +reversed);
        else
        {
            System.out.println("Not palindrome :"  +reversed);
        }
    }
}
