package WEEK10;

public class BusiestBusRow {

    public static void busiestRow(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return;
        }

        int maxRowIndex = 0;
        int maxTotal = -1;
        for (int i = 0; i < grid.length; i++) {
            int currentTotal = 0;
            for (int j = 0; j < grid[i].length; j++) {
                currentTotal += grid[i][j];
            }
            if (currentTotal > maxTotal) {
                maxTotal = currentTotal;
                maxRowIndex = i;
            }
        }

        System.out.println("Row " + maxRowIndex + ", Total " + maxTotal);
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 2, 0, 1 },
                { 3, 3, 1 },
                { 1, 1, 1 }
        };

        busiestRow(grid);
    }
}
