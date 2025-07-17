package Java_Tasks;


class Employee {
    public String roles() {

        return "GM";

    }}

class Tester extends Employee {
    public String roles()

    {

        return "Tester";

    }
}

class Clerk extends Employee {
    public String roles() {

            return "clerk";
        }
    }
    class Manager extends Employee{
        public String roles(){

                return "Manager";
            }}

            public class EmployeeDemo {
                public static void main(String[] args) {

                    Employee emp = new Clerk();
                    Employee emp1 = new Tester();
                    Employee emp2 = new Manager();

                    System.out.println(" EMployee working as "  +emp.roles());
                    System.out.println(" EMployee working as "  +emp1.roles());
                    System.out.println(" EMployee working as "  +emp2.roles());



                }

                }

