
//4) Book Class with Constructor
// Write a Book class that takes title, author, and price via constructor. Display all values.
package Java_Tasks;

public class Book {
    String BookName;
    String Title;
    String Author;
    double price;

    
    Book( String BookName, String Title,String Author, double price ){  //constructor
        this.BookName= BookName;
        this.Title= Title;
        this.Author= Author;
        this.price = price;

    }

    void display(){
        System.out.println(" This bookname is :" +BookName);
        System.out.println(" Title  :"  +Title);
        System.out.println(" Author :"   +Author);
        System.out.println("Price    :"   +price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Ramayan", "Ganpati", "ganesha", 4500);
        b1.display();
    }


}
