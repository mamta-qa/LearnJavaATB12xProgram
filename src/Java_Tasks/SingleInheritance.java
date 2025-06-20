package Java_Tasks;

 class controller {
        public void handleRequest()
        {
            System.out.println(" this is handleRequest");

        }
    }
    class Usercontroller extends controller{

        public void getUser(){

            System.out.println("User controller");
        }
    }

public class SingleInheritance {
    public static void main(String[] args) {
        Usercontroller uc = new Usercontroller();
        uc.handleRequest();
        uc.getUser();
    }
}