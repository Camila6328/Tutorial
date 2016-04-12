package PerformanceBenchmark1;

import java.util.*;

public class PerformanceBenchmark1 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list11 = new LinkedList<>();

        Random rand = new Random();

        System.err.println("              " + "ArrayList" + "              " + "LinkedList");
        {

            long start = System.currentTimeMillis();
            for (int i = 1; i <= 10000; i++) {
                int value = rand.nextInt(100000);
                list1.add(value);
            }

            long end = System.currentTimeMillis();

            System.out.print("              " + (end - start));
            //System.out.println("list1=" + list1);
        }

        {
            long start = System.currentTimeMillis();
            for (int i = 1; i <= 10000; i++) {
                int value = rand.nextInt(100000);
                list11.add(value);
            }
            long end = System.currentTimeMillis();
            System.out.println("                          " + (end - start));
            // System.out.println("list1=" + list11);
        }
        {

            long start = System.currentTimeMillis();
            for (long i = 1; i < 10000; i++) {
                int value = rand.nextInt(10000);
                if (value < value) {
                    list1.remove(value);
                }
            }

            long end = System.currentTimeMillis();

            System.out.print("              " + (end - start));
            //System.out.println("list1=" + list1);
        }

        {
            long start = System.currentTimeMillis();
            for (int i = 1; i <= 10000; i++) {
                int value = rand.nextInt(100000);
                if (value < value) {
                    list11.remove(value);
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("                          " + (end - start));
            // System.out.println("list1=" + list11);
        }
        {
            int value = rand.nextInt(100000);
            for (int i = 1; i < 10000; i++) {
                list1.add(value);
            }

            long start = System.currentTimeMillis();
            for (int i = 1; i < list1.size(); i++) {
                list1.get(i);
            }
            long end = System.currentTimeMillis();
            //System.out.println(list1);
            System.out.print("              " + (end - start));
        }
        {
            int value = rand.nextInt(100000);
            for (int i = 1; i < 100000; i++) {
                list11.add(value);
            }

            long start = System.currentTimeMillis();
            for (int i = 1; i < list1.size(); i++) {
                list11.get(i);
            }
            long end = System.currentTimeMillis();
            //System.out.println(list1);
            System.out.println("                          " + (end - start));
            //System.out.println("list1=" + list1);
        }
        // System.out.println(list1);
        {
            for (int i = 1; i <= 10000; i++) {
                int value = rand.nextInt(100000);
                list1.add(value);
            }

            long start = System.currentTimeMillis();

            for (int i = 1; i < list1.size(); i++) {
                int value = rand.nextInt(100000);
                list1.set(i, value);
            }
            long end = System.currentTimeMillis();

            System.out.print("              " + (end - start));

        }
        {
            for (int i = 1; i <= 10000; i++) {
                int value = rand.nextInt(100000);
                list11.add(value);
            }

            long start = System.currentTimeMillis();

            for (int i = 1; i < list11.size(); i++) {
                int value = rand.nextInt(100000);
                list11.set(i, value);
            }
            long end = System.currentTimeMillis();

            System.out.println("                         " + (end - start));

        }

    }
}
