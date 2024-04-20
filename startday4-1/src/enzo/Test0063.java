package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description: 动态规划，最小路径和
 *
 * @Author ENZO
 * @Create 2024/4/2 13:56
 */
public class Test0063 {
    public int minPathSum(int[][] grid) {
        int length = grid.length;
        int weight = grid[0].length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < weight; j++) {
                if (i == 0 && j == 0) continue;
                else if (i == 0) grid[0][j] += grid[0][j - 1];
                else if (j == 0) grid[i][0] += grid[i - 1][0];
                else grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[length - 1][weight - 1];
    }

    @Test
    public void test() {

    }
}
