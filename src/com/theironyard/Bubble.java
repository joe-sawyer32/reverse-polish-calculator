package com.theironyard;

/**
 * Created by Joe on 7/20/17.
 */

/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Bubble {

    public static int[] sort(int[] unsorted) {
        int[] sorted = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            sorted[i] = unsorted[i];
        }
        boolean isSorted = false;
        while (!isSorted) {
            boolean noSwaps = true;
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (sorted[i] > sorted[i+1]) {
                    int tempInt = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = tempInt;
                    if (noSwaps) {
                        noSwaps = false;
                    }
                }
            }
            if (noSwaps) {
                isSorted = true;
            }
        }
        return sorted;
    }

    public String[] sort(String[] unsorted) {
        String[] sorted = new String[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            sorted[i] = unsorted[i];
        }
        boolean isSorted = false;
        while (!isSorted) {
            boolean noSwaps = true;
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (sorted[i].compareTo(sorted[i+1]) > 0) {
                    String tempString = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = tempString;
                    if (noSwaps) {
                        noSwaps = false;
                    }
                }
            }
            if (noSwaps) {
                isSorted = true;
            }
        }
        return sorted;
    }
}
