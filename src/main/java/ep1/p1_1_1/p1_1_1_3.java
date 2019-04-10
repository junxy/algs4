package ep1.p1_1_1;

import edu.princeton.cs.algs4.StdIn;

public class p1_1_1_3 {
    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        var n1 = StdIn.readInt();
        System.out.println("Enter second number: ");
        var n2 = StdIn.readInt();
        System.out.println("Enter third number: ");
        var n3 = StdIn.readInt();

        if (n1 == n2 && n2 == n3)
            System.out.println("equal");
        else
            System.out.println("not equal");

    }
}
