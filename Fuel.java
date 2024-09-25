import java.util.Scanner;

public class Fuel {
  public static void main(String args[]) {
    final int milage;
    System.out.println("enter milage of a vehicle:");
    Scanner in = new Scanner(System.in);
    milage = in.nextInt();
    System.out.println("enter distance:");
    int f2 = in.nextInt();
    int f1 = f2 / milage;
    System.out.println("fuel required= " + f1 + " litres");
  }
}