package Java_Tasks;

public class UserTest {

    public void login() {
        System.out.println(" user can login");
    }

    public static void main(String[] args) {
        SuperAdminTest sobj = new SuperAdminTest();
        sobj.login();
        sobj.accessAdminPanel();
        sobj.shutdownSystem();
    }
}

class AdminUserTest extends UserTest {
    public void accessAdminPanel() {
        System.out.println(" admin can access");
    }
}

class SuperAdminTest extends AdminUserTest {
    public void shutdownSystem() {
        System.out.println("system is shutting down");
    }
}
