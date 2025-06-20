package Java_Tasks;

public class Student {
    String name;
    int age;

    //constructor
    Student (String name, int age){
        this.name= name;
        this.age =age;

    }
    void display()

    {
        System.out.println("name:"  +name);
        System.out.println("Age:"   +age);

    }

    public static void main(String[] args) {
        Student s1= new Student("Bhaavik", 4);
        s1.display();

    }

}
