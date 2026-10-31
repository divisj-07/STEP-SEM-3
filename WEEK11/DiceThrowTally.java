package WEEK11;

import java.util.Arrays;

public class DiceThrowTally {

    public static int[] diceSort(int[] rolls) {
        if (rolls == null || rolls.length == 0) {
            return new int[0];
        }
        int[] count = new int[7];
        for (int roll : rolls) {
            if (roll >= 1 && roll <= 6) {
                count[roll]++;
            }
        }
        System.out.print("Counts: ");
        for (int v = 1; v <= 6; v++) {
            System.out.print(v + ":" + count[v] + (v < 6 ? " " : "\n"));
        }
        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int v = 1; v <= 6; v++) {
            while (count[v] > 0) {
                sorted[index++] = v;
                count[v]--;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        int[] rolls = { 4, 1, 6, 4, 2, 1, 4 };

        int[] sortedRolls = diceSort(rolls);
        System.out.println("Sorted: " + Arrays.toString(sortedRolls));
    }
}
