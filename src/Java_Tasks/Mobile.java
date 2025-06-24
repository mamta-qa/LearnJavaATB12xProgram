package Java_Tasks;

public class Mobile {
    String brandName;
    int price;


    Mobile(String brand) {
        this.brandName = brand;
    }


    Mobile(String brand, int p1) {
        this.price = price;
        this.brandName = brand;

    }

    void Display() {
        System.out.println(" Display brand Price :" + price);
    }


    public static void main(String[] args) {
        Mobile M1 = new Mobile("Iphone");
        M1.Display();
        System.out.println();


        Mobile M2 = new Mobile("MotoG", 45000);
        M2.Display();

    }
}






