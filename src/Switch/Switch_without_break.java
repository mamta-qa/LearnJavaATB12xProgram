package Switch;

import java.util.Scanner;

public class Switch_without_break {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter any number");{


            int day = scanner.nextInt();

                switch (day) {

                    case 1:
                        System.out.println("mon");
                    case 2:
                        System.out.println(" tuesday");
                    case 3:
                        System.out.println("Wed");
                    case 4:
                        System.out.println("Thur");
                    case 5:
                        System.out.println("Friday");
                    case 6:
                        System.out.println("Sat");
                    case 7:
                        System.out.println("Sun");
                    default:
                        System.out.println("Invalid, day number");
                }
            }
        }
    }






