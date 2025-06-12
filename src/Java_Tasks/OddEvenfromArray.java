package Java_Tasks;

public class OddEvenfromArray
{
    public static void main(String[] args) {

        int arr[]={10,11,12,14,15,18};
        System.out.println(" even number:"  );
        for( int num : arr){
            if ( num %2==0){
                System.out.print(" " +num);

            }}
        System.out.println(" ");

            System.out.println(  " odd number: ");
            for( int num : arr){
                if ( num %2!=0){
                    System.out.print(" "+num);
                }
            }
        }


}
