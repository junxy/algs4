package ep1.p1_1_1;

import edu.princeton.cs.algs4.StdIn;

public class p1_1_1_9 {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int N = StdIn.readInt();

        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);

    }
}
