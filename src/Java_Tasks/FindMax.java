package Java_Tasks;

import javax.imageio.stream.ImageInputStream;

public class FindMax {
    public int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public int max(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= c)
            return b;
        else
            return c;
    }
        public double  max( double a, double b){
            if (a > b)
                return a;
            else
                return b;

        }
        public static void main (String[]args){
            FindMax maximum = new FindMax();
            int m1 = maximum.max(5, 6, 7);
            System.out.println(" max int is  " + m1);
            int m2 = maximum.max(7, 8);
            System.out.println(" max int is  " + m2);
            Double m3 = maximum.max(7.5, 8.88);
            System.out.println(" max int is  " + m3);


        }

    }
