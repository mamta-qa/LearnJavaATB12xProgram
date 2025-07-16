package Java_Tasks;

public class multidata {
    public int multiply(int a, int b){
        return a*b;
}
public int multiply( int a , int b, int c){
    return a*b*c;

}

public static void main(String[] args) {

        multidata multi = new multidata();
        int result1 = multi.multiply(5,12);
    System.out.println(" sum of 2 num is " +result1);
    int result2= multi.multiply(2,2,2);
    System.out.println(" sum of 3 num is " +result2);


}

}
