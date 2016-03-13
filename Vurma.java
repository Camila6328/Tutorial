package vurma;
public class Vurma {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        int b[][] = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 5);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (int) (Math.random() * 5);
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int s[][] = new int[2][4];
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < s.length; k++) {
                s[i][k] = 0;
                for (int j = 0; j < b[i].length; j++) {
                    s[i][k] = s[i][k] + a[i][j] * b[j][k];
                }
                System.out.print(s[i][k] + " ");
            }
            System.out.println();
        }
    }
}
