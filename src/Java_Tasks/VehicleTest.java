package Java_Tasks;

public class VehicleTest {
    VehicleTest(){
        System.out.println("Vehicle is ready");
    }

}
class Biking extends VehicleTest{

Biking()
{
    System.out.println(" Bike is ready");

}

public static void main(String[] args) {
    Biking bobj = new Biking();
}

}
