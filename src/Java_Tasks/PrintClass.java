package Java_Tasks;

public class PrintClass {

    public void printData( String data){
        System.out.println("string data   " +data);
    }

    public void printData( int  data){
        System.out.println("int data" +data);

    }

    public void printData( float  data){
        System.out.println("float data" +data);
    }
    public void printData( double  data) {
        System.out.println("double data" + data);
    }

    public static void main(String[] args) {
        PrintClass print = new PrintClass();
        print.printData(456);
        print.printData(4.3f);
        print.printData(23.63);
        print.printData("Mamta");

    }
    }
