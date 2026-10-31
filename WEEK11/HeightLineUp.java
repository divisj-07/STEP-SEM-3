package WEEK11;

import java.util.Arrays;

public class HeightLineUp {

    public static void lineUp(int[] heights) {
        if (heights == null || heights.length == 0) {
            return;
        }

        int pass = 1;
        int n = heights.length;

        while (true) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            if (!swapped) {
                break;
            }

            pass++;
        }
    }

    public static void main(String[] args) {
        int[] heights1 = { 4, 2, 5, 1 };
        System.out.println("Input: [4, 2, 5, 1]");
        lineUp(heights1);
        System.out.println();
        int[] heights2 = { 1, 3, 2, 4 };
        System.out.println("Input: [1, 3, 2, 4]");
        lineUp(heights2);
    }
}
