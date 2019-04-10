package ep1.p1_1_1;

public class p1_1_1_16 {
    public static void main(String[] args) {

        String rs = exR1(6);
        System.out.println(rs);

    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

}
