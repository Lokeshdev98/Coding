import java.util.Scanner;

public class Count {
    public static void main(String args[]) {
        int n, m, k, count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        n = in.nextInt();
        m = n;
        while (n > 0) {
            k = n % 10;
            count = count + 1;
            n = n / 10;

        }
        System.out.println("count of digits " + count);
    }
}
/*
 * output:
 * enter the number
 * 143
 * count of digits 3
 */