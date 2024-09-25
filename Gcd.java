import java.util.Scanner;

class Gcd {
    public static void main(String[] args) {
        int n1, n2, gcd = 0, i;
        System.out.println("enter the values:");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        for (i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("gcd of " + n1 + "and " + n2 + "is" + gcd);
    }
}
