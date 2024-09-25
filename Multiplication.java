import java.util.Scanner;

class multiplication {
    public static void main(String arg[]) {
        int b, c, i;
        System.out.println(" enter the table number");
        Scanner a = new Scanner(System.in);
        b = a.nextInt();
        for (i = 1; i <= 10; i++) {
            c = b * i;
            System.out.println(b + "x" + i + "=" + c);

        }
    }
}