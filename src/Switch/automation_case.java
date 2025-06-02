package Switch;

import java.util.Scanner;

public class automation_case
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch(browser){
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println("..............");
                System.out.println("tc1");
                System.out.println("tc2");

                break;

            case "firefox":
                    System.out.println(" starting the firefox");

                    break;

            case "edge":
                System.out.println("starting the edge");

                break;
            default:
                System.out.println("no idea");
                break;



        }
    }
}
