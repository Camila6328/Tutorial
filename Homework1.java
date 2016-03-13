package homework1;

public class Homework1 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("max=" + a[maxIndex]);
        System.out.println("maxIndex=" + maxIndex);
        System.out.println("min=" + a[minIndex]);
        System.out.println("minIndex=" + minIndex);

        int c;
        for (int i = 1; i < a.length; i++) {
            c = a[minIndex];
            a[minIndex] = a[maxIndex];
            a[maxIndex] = c;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
