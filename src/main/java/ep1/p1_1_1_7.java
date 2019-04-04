package ep1;

public class p1_1_1_7 {
    public static void main(String[] args) {

        // a
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            System.out.println("t: " + t);
        }
        System.out.println(t);
        System.out.println();

        // b
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        System.out.println(sum);

        // c
        int sum1 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < i; j++)
                sum1++;
        System.out.println(sum1);

    }
}
