package ep1;

public class p1_1_1_2 {
    public static void main(String[] args) {

        System.out.println("1.1.2-1: ");
        System.out.println((1 + 2.236) / 2);
        System.out.println(((Object) ((1 + 2.236) / 2)).getClass().getName());
        System.out.println();

        System.out.println("1.1.2-2: ");
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println();

        System.out.println("1.1.2-3: ");
        System.out.println(4.1 >= 4);
        System.out.println();

        System.out.println("1.1.2-4: ");
        System.out.println(1 + 2 + "3");        // 33
        System.out.println(1 + 2 + "3" + 4.0);  // 334?x => 334.0
        System.out.println();

    }
}
