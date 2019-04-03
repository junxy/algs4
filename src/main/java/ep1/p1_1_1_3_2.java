package ep1;

import edu.princeton.cs.algs4.StdIn;

public class p1_1_1_3_2 {
    public static void main(String[] args) {

        var nums = new int[3];
        var i = 0;
        while (true) {
            System.out.println(String.format("Enter no.%s number: ", i + 1));
            nums[i] = StdIn.readInt();
            i++;
            if (i == 3) {
                i = 0;
                if (nums[0] == nums[1] && nums[1] == nums[2])
                    System.out.println("equal");
                else
                    System.out.println("not equal");
                System.out.println("Press enter `q` to exit directly");
            }
        }
    }
}
