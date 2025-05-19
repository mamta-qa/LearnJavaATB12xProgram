package Practice;

import java.util.Scanner;

public class compareString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string1");
        String S1 = sc.nextLine();

        System.out.println("enter string2");
        String S2 = sc.nextLine();

        if (S1.equals(S2))
            System.out.println("strings are same " + S1 + "," + S2);

            else{
                System.out.println("strings are not same " + S1 + "," + S2);

                sc.close();
            }


        }
    }
