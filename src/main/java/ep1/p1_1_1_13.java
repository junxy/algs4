package ep1;

public class p1_1_1_13 {
    public static void main(String[] args) {

        int m = 3, n = 5;
        int count = 1;
        int[][] arr2d = new int[m][n];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = count;
                count++;
            }
        }
        printArr2d(arr2d);

        // transposition
        int[][] arr2dT = new int[arr2d[0].length][arr2d.length];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2dT[j][i] = arr2d[i][j];
            }
        }
        printArr2d(arr2dT);

    }

    private static void printArr2d(int[][] arr2d) {
        System.out.println();
        System.out.println("print: ");
        for (int i = 0; i < arr2d.length; i++) {
            System.out.print("L" + i);
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(" " + arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
