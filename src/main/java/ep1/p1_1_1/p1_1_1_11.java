package ep1.p1_1_1;

public class p1_1_1_11 {
    public static void main(String[] args) {

        Boolean[][] data = new Boolean[4][4];
        data[0] = new Boolean[]{false, true, false, true};
        data[1] = new Boolean[]{true, false, true, false};
        data[2] = new Boolean[]{false, true, false, true};
        data[3] = new Boolean[]{true, false, true, false};

        for (int i = 0; i < data.length; i++) {
            System.out.print("L: " + i + "  ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(j + "->" + (data[i][j] ? " [*] " : " [ ] "));
            }
            System.out.println();
        }

    }
}
