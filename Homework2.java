
public class Homework2 {

    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int i, j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int maxI = 0;
        int maxJ = 0;
        int minI = 0;
        int minJ = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (a[i][j] > a[maxI][maxJ]) {
                    maxI = i;
                    maxJ = j;
                }
                if (a[i][j] < a[minI][minJ]) {
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.println("max=" + a[maxI][maxJ]);
        System.out.println("max:I:J=" + maxI + maxJ);
        System.out.println("min=" + a[minI][minJ]);
        System.out.println("min:I:J=" + minI + minJ);
        int c = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                c = a[maxI][maxJ];
            
            a[maxI][maxJ] = a[minI][minJ];
            a[minI][minJ] = c;

        }}
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
