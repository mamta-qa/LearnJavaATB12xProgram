package Java_Tasks;

public class RectangleArea {

    int length;
    int Breadth;

     RectangleArea(int length, int Breadth) { //constructor
        this.Breadth = Breadth;
        this.length = length;

    }

    void calculateArea(){ //method

    int area = length * Breadth;

        {
            System.out.println(" length is : " + length);
            System.out.println(" bredth is :" + Breadth);
            System.out.println(" area is :" + area);
        }}


    public static void main(String[] args) {
        RectangleArea r1 = new RectangleArea(10, 20 );
        r1.calculateArea();
    }
}


