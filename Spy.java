import java.util.*;

public class Spy {
    public static void main(String args[]) {
        int k, m, n, sum = 0, prod = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a  number:");
        n = in.nextInt();
        m = n;
        while (n > 0) {
            k = n % 10;
            sum = sum + k;
            prod = prod * k;
            n = n / 10;
        }
        if (sum == prod) {
            System.out.println(m + " is a SPY number");
        } else
            System.out.println(m + " is not a SPY number");
    }
}