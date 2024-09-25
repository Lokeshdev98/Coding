import java.util.Scanner;
import java.lang.*;

public class Password {
    public static void main(String args[]) {
        String s;
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a password");
        s = in.next();
        a = s.length();
        if (a >= 8) {
            if (a >= 97 && a <= 122 || a >= 65 && a <= 90) {
                if (a > 0 && a <= 9) {
                    System.out.println("password is correct");
                }
            } else {
                System.out.println("password is incorrect");
            }
        }

    }
}
