package Array;

public class ArrayClass {
    public static void main(String[] args) {
        int[] array = {45, 65, 58, 78, 85, 90, 99, 45};
        int max_number = give_max_element_array(array);
        System.out.println("Max Number is : " + max_number);
    }

    static int give_max_element_array(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }
}