package Java_Tasks;

public class Animalss {

    public void sound() {
        System.out.println(" generic sound");
    }
}
     class Cat extends Animalss {
        public void meow(){
            System.out.println(" cat sound meow");
        }

        public static void main(String[] args) {

            Cat cobj = new Cat();
            cobj.meow();
            cobj.sound();


        }
    }

