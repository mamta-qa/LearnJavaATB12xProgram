package Java_Tasks;

// Base class
class Controller1 {
    public void getUser() {
        System.out.println("This is getUser");
    }
}

// Intermediate class
class SafeController extends Controller1 {
    public void safeguard() {
        System.out.println("This is safeguard");
    }
}

// Derived class
class ProtectController extends SafeController {
    public void protectGuard() {
        System.out.println("This is protectGuard");
    }
}

// Main class
public class Multilevel {
    public static void main(String[] args) {
        ProtectController pc = new ProtectController();

        pc.getUser();         // Inherited from Controller1
        pc.safeguard();       // Inherited from SafeController
        pc.protectGuard();    // From ProtectController itself
    }
}
