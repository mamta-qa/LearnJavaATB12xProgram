package Java_Tasks;

public class triangleClassifier {
    public static void main(String[] args) {
        int a = 101, b = 10, c = 102;
        if (a == b && b == c)
            System.out.println(" Triangle is equilateral");
        else if (a == b || b == c || a == c)
            System.out.println(" Triangle is Isosceles");

        else
            System.out.println(" Triangle is scalene");

    }
}
