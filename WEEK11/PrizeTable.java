package WEEK11;

import java.util.Arrays;

public class PrizeTable {

    public static int prizeTable(int[] marks) {
        if (marks == null || marks.length <= 1) {
            return 0;
        }

        int swapCount = 0;
        for (int i = 0; i < marks.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[maxIdx]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int temp = marks[i];
                marks[i] = marks[maxIdx];
                marks[maxIdx] = temp;
                swapCount++;
            }
        }

        return swapCount;
    }

    public static void main(String[] args) {
        int[] marks1 = { 45, 90, 60, 75 };
        int swaps1 = prizeTable(marks1);
        System.out.println(Arrays.toString(marks1) + " swaps = " + swaps1);
        int[] marks2 = { 80, 70, 60 };
        int swaps2 = prizeTable(marks2);
        System.out.println(Arrays.toString(marks2) + " swaps = " + swaps2);
        int[] marks3 = { 10, 50, 30, 90, 20 };
        int swaps3 = prizeTable(marks3);
        System.out.println(Arrays.toString(marks3) + " swaps = " + swaps3);
    }
}