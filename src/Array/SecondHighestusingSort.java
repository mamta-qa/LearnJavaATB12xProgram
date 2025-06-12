package Array;

import java.util.Arrays;

public class SecondHighestusingSort {
    public static void main(String[] args) {

        int marks []= {77,55,66,33,11};
        Arrays.sort(marks);
        System.out.println(marks[ marks.length-3]);
    }
}
