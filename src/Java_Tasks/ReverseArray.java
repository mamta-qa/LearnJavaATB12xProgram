package Java_Tasks;
import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int arr[] ={ 10,20,44,34,54,45};
        for( int i= arr.length-1; i>=0; i--)
            System.out.print(arr[i] +" ");
        //System.out.println("Array : ");
            System.out.println(Arrays.toString(arr));
    }
}
