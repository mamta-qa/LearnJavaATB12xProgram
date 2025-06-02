package Switch;

public class item {
    public static void main(String[] args) {
        int itemcode= 006;
        switch(itemcode){
            case 001,002,003:
                System.out.println("electronics items");

                break;
            case 004,005,006:
                    System.out.println(" saloon items");
                    break;
            case 07:

                System.out.println("home items");

                break;
                default:
                System.out.println("none");
        }
    }
}
