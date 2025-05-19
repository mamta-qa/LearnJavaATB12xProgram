package Java_Tasks;

public class FindAge {
    public static void main(String[] args) {
        int age = 15;

        String findAge = ( age >65 ) ? " i am seniorCitizen" : (age >18 ? "i am adult" : "i am minor" );
        System.out.println(findAge);
    }
}

