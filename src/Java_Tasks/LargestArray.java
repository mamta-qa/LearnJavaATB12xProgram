package Java_Tasks;

public class LargestArray {
    public static void main(String[] args) {
        int arr[] = {20, 54, 56, 99, 69, 42, 90};
        int max = arr[0];
 for ( int i=1; i< arr.length; i++){
        if (arr[i] > max) {
            max = arr[i];
        }}
            System.out.println(" " + max);


}}