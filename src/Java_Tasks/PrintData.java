package Java_Tasks;

public class PrintData {

    public int add( int a , int b){
        return a+b;

    }
    public double add( double a , double b) {
        return a + b;
    }
    public float add( float a , float b) {
        return a + b;
    }

    public void print(int intSum, double doubleSum, float floatSum) {
        System.out.println("Sum of integers: " + intSum);
        System.out.println("Sum of doubles: " + doubleSum);
        System.out.println("Sum of floats: " + floatSum);
    }

    public static void main(String[] args) {


            PrintData printd = new PrintData();

            int intSum = printd.add(22, 45);
            double doubleSum = printd.add(44.25, 25.2555);
            float floatSum = printd.add(4.2f, 5.2f); // use 'f' for float literals

            printd.print(intSum, doubleSum, floatSum);
        }
    }