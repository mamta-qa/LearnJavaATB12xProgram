package Constructors;

public class ParameterizedConstructor {
    ParameterizedConstructor(int a){

        int age = a;

        System.out.println("Age is : " +age );

    }

    public static void main(String[] args) {
        ParameterizedConstructor pj = new ParameterizedConstructor(54);

    }
}
