public class Marks {
    public static void main(String args[]) {
        int maths = 100, phy = 100, english = 100, total, per;
        total = maths + phy + english;
        System.out.println("total=" + total);
        per = ((total / 300) * 100);
        System.out.println("per=" + per);

    }
}
