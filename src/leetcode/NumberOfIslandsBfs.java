package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfIslandsBfs {
    final List<int[]> iter = Arrays.asList(
            new int[]{1, 0},
            new int[]{-1, 0},
            new int[]{0, 1},
            new int[]{0, -1}
    );

    /**
     * Find the number of islands in the given matrix
     *
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int[][] visit = new int[grid.length][grid[0].length];

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    // iterate in bfs and mark all neighbours to '0'
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    while (!q.isEmpty()) {
                        int[] loc = q.poll();
                        // add neighbours only when value is '1'
                        for (int[] dir : iter) {
                            int r = loc[0] + dir[0];
                            int c = loc[1] + dir[1];
                            if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
                                continue;
                            }
                            if (grid[r][c] == '1') {
                                grid[r][c] = '0';
                                q.offer(new int[]{r, c});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfIslandsBfs n = new NumberOfIslandsBfs();
        System.out.println(n.numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}}));
    }
}
