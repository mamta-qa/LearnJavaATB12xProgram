package Java_Tasks;

public class Animals {

    public String sound() {
        return "return some generic sounds";
    }
}
    class cat extends Animals {

        public String sound() {
            return "meow";
        }
    }
         class dog extends Animals {

            public String sound() {
                return "bark";
            }}

            class cow extends Animals {


                public String sound() {
                    return "yyuuuu";
                }}
 class AnimalsDemo {
    public static void main(String[] args) {
        Animals myDog = new dog();
        Animals myCat = new cat();
        Animals myCow = new cow();

        System.out.println("Dog sound: " + myDog.sound());
        System.out.println("Cat sound: " + myCat.sound());
        System.out.println("Cow sound: " + myCow.sound());
    }
}