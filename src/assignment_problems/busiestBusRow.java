package assignment_problems;

public class BusiestBusRow {

    public static int[] busiestRow(int[][] grid) {
        int maxRow = 0;
        int maxTotal = -1;

        for (int i = 0; i < grid.length; i++) {
            int currentTotal = 0;
            for (int j = 0; j < grid[i].length; j++) {
                currentTotal = currentTotal + grid[i][j];
            }

            if (currentTotal > maxTotal) {
                maxTotal = currentTotal;
                maxRow = i;
            }
        }

        int[] result = new int[2];
        result[0] = maxRow;
        result[1] = maxTotal;
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 0, 1},
                {3, 3, 1},
                {1, 1, 1}
        };

        int[] ans = busiestRow(grid);
        System.out.println("Row " + ans[0] + ", Total " + ans[1]);
    }
}