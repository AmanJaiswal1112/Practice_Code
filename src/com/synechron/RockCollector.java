package com.synechron;
public class RockCollector {

    public static int optimalPath(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Create a dp array to store the maximum rocks collected to each cell
        int[][] dp = new int[rows][cols];

        // Initialize the starting point
        dp[rows - 1][0] = grid[rows - 1][0];

        // Fill the dp array
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < cols; j++) {
                // Current cell value
                dp[i][j] = grid[i][j];

                // Add the maximum value from the possible previous cells
                if (i < rows - 1 && j > 0) {
                    dp[i][j] += Math.max(dp[i + 1][j], dp[i][j - 1]);
                } else if (i < rows - 1) {
                    dp[i][j] += dp[i + 1][j];
                } else if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        // The value in the top-right corner is the result
        return dp[0][cols - 1];
    }

    public static void doTestsPass() {
        int[][] grid1 = {
                {0, 0, 0, 0, 5},
                {0, 1, 1, 1, 0},
                {2, 0, 0, 1, 0}
        };
        int result1 = optimalPath(grid1);
        System.out.println("Test 1 - Expected: 10, Got: " + result1);

        int[][] grid2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result2 = optimalPath(grid2);
        System.out.println("Test 2 - Expected: 29, Got: " + result2);
    }

    public static void main(String[] args) {
        doTestsPass();
    }
}
