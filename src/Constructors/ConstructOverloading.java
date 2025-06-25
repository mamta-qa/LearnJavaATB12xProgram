package Constructors;

public class ConstructOverloading {
    ConstructOverloading(){
        System.out.println("No arg constructor");
    }

    ConstructOverloading( String Name){
        System.out.println("My Name "  +Name);
    }

    ConstructOverloading( int age ,String Name){
        System.out.println(Name+ " age is "  +age);
    }

    public static void main(String[] args) {


    ConstructOverloading c1= new ConstructOverloading();
    ConstructOverloading c2= new ConstructOverloading("Mamta");
    ConstructOverloading c3 = new ConstructOverloading(30, "Testing");
}
}