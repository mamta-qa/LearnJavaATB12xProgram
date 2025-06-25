package Practice;

public class MoveZero {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,0,9,0,0,8,7};
        int n= arr.length;
        int pos= 0;

        for ( int i=0; i<n; i++){
            if (arr[i] !=0){
                arr[pos] = arr[i];
                pos++;
            }
        }
        for( int i=pos; i<n; i++){
            arr[i]=0;
        }

        for ( int i=0; i<n; i++){
            System.out.print( arr[i]+ " ");
        }

    }
}
