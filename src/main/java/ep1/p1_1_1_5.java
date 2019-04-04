package ep1;

import edu.princeton.cs.algs4.StdIn;

public class p1_1_1_5 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter X number: ");
            var x = StdIn.readDouble();
            System.out.println("Enter Y number: ");
            var y = StdIn.readDouble();

            if (x > 0.0 && x < 1.0 && y > 0.0 && y < 1.0)
                System.out.println(true);
            else
                System.out.println(false);

            System.out.println();
            System.out.println("Press enter `q` to exit directly");
        }
    }
}
