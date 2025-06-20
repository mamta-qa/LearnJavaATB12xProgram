package Java_Tasks;

// Parent class
 public class Baseclass {
    void BrowserLaunch() {
        System.out.println("Open browser");
    }
}

// Child class 1
class login extends Baseclass {
    void loginpage() {
        System.out.println("I am login");
    }
}

// Child class 2
class Registerpage extends Baseclass {
    void registerPage() {
        System.out.println("I am going to register now");
    }
}

// Main runner class
class Test {
    public static void main(String[] args) {
        // Object for login
        login lp = new login();
        lp.loginpage();
        lp.BrowserLaunch();

        // Object for Registerpage
        Registerpage regp = new Registerpage();
        regp.BrowserLaunch();
        regp.registerPage();
    }

}
