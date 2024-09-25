import java.util.Scanner;

public class Cricket {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        final int PLAYERS = 11;
        int runs[] = new int[PLAYERS];
        String names[] = new String[PLAYERS];
        for (int i = 0; i < PLAYERS; i++) {
            System.out.println("enter player" + (i + 1) + "name");
            names[i] = in.nextLine();
            System.out.println("enter player" + (i + 1) + "score");
            runs[i] = in.nextInt();
            in.nextLine();
        }
        int highscoreidx = 0;
        for (int i = 1; i < sPLAYERS; i++) {
            if (runs[i] > runs[highscoreidx])
                highscoreidx = i;
        }
        System.out.println("highest score");
        System.out.println(names[highscoreidx] + "\t" + runs[highscoreidx]);

    }
}