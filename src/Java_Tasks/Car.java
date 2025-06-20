package Java_Tasks;

public class Car {
    String brand;
    int model;
    int price;


Car( String brand, int model, int price){
    this.brand = brand;
    this.model = model;
    this.price = price;

}
void display()
{
    System.out.println(" Brand of car is : "   +brand);
    System.out.println(" model num is: "        +model);
    System.out.println(" pricing is : "   +price);

}

    public static void main(String[] args) {
        Car c1 = new Car(" Tesla",111, 2000000);
        c1.display();


    }}
