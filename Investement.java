import java.util.Scanner;

public class Investement {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the present investement value:");
        double p = in.nextDouble();
        System.out.println("enter the rate of interest:");
        double r = in.nextDouble();
        System.out.println("enter the time period:");
        double t = in.nextDouble();
        double f = p * Math.pow((1 + r / 100), t);
        System.out.println("future investement is " + f);
    }
}