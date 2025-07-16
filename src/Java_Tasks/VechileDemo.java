package Java_Tasks;

class Vehicle {
    public String start() {
        return "starting the vechicle is same for each";

    }}

     class Bike extends Vehicle {

        public String start() {
            return "Kick the bike to start";

        }
    }

    class Cars extends Vehicle {

        public String start() {
            return "turn on the button to start";

        }}


public class VechileDemo {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        Vehicle myCar = new Cars();

        System.out.println(" my bike : "  +myBike.start());
        System.out.println(" my car : "  +myCar.start());

    }}
