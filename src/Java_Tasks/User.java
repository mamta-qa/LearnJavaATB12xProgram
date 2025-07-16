package Java_Tasks;


class UserDemo {
    public String login(){
        return "userlogin";
    }
}
class Adminuser extends UserDemo{
    @Override
    public String login(){
        return "adminLogin";

    }}
    class RegularUser extends UserDemo{
        @Override
        public String login(){
            return "regularuser";
    }
}
public class User {
    public static void main(String[] args) {
        UserDemo us1 = new Adminuser();
        UserDemo us2 = new RegularUser();
        UserDemo us3 = new UserDemo();



        System.out.println("user  "  +us1.login());
        System.out.println("user  "  +us2.login());
        System.out.println("user  "  +us3.login());

    }
}
