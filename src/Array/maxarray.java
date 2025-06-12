package Array;

public class maxarray {

    public static void main(String[] args) {
        int marks[] = {44, 55, 45, 25, 78, 66, 36, 99, 777, 78};

        int max = marks[0];
        int min = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];

            }
            if (marks[i] < min) {
                min = marks[i];
            }
        }

        System.out.println("min number is " + min);
        System.out.println("max number is " + max);
    }
}