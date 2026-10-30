public class BusiestBusRow {

    // Returns array: [rowIndex, maxTotal]
    // Time Complexity: O(r * c) where r is rows and c is columns
    // Space Complexity: O(1) auxiliary space
    public static int[] busiestRow(int[][] grid) {
        int bestRowIndex = 0;
        int maxTotal = -1;

        for (int i = 0; i < grid.length; i++) {
            int rowTotal = 0;
            for (int j = 0; j < grid[i].length; j++) {
                rowTotal += grid[i][j];
            }
            // Update only when strictly larger to preserve smaller index on tie
            if (rowTotal > maxTotal) {
                maxTotal = rowTotal;
                bestRowIndex = i;
            }
        }

        return new int[]{bestRowIndex, maxTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };

        int[] result = busiestRow(grid);
        System.out.println("Row " + result[0] + ", Total " + result[1]);
    }
}