import java.util.Scanner;

public class Esum {
    public static void main(String args[]) {
        int i, n, esum = 0, osum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                esum = esum + i;
            } else {
                osum = osum + i;
            }
        }
        System.out.println("esum= " + esum);
        System.out.println("osum= " + osum);
    }
}
/*
 * output:
 * enter the number:
 * 5
 * esum= 6
 * osum= 9
 */
