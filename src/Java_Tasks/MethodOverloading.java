package Java_Tasks;

public class MethodOverloading {

    public int add ( int a, int b){


        return a+b;

        }

        public  double add ( double a, double b) {

            return a + b;
        }

    public static void main(String[] args) {
        MethodOverloading calculate = new MethodOverloading();
        int intSum = calculate.add( 5,10);
        System.out.println(" sum is "  +intSum);

        double doubleSum = calculate.add( 10.5,1.63);
        System.out.println("sum of double is"  +doubleSum);

    }


    }
