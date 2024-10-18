public class ShortestPathInBinaryMatrix {
  public static int[][] grid = new int[][] { {1,0,0},{1,1,0},{1,1,0} };

  public static void main(String[] args) {
    // convert 1s to -1s and 0s to Infinity
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 0) {
          grid[i][j] = Integer.MAX_VALUE;
        }
        if (grid[i][j] == 1) {
          grid[i][j] = -1;
        }
      }
    }
    recursion(0, 0, 1);
    int answer = grid[grid.length-1][grid.length-1] == Integer.MAX_VALUE ? -1 : grid[grid.length-1][grid.length-1];
    System.out.println(answer);
  }

  public static void recursion(int row, int col, int steps) {
    // if out of bounds
    if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
      return;
    }
    // if obstacle, return
    if (grid[row][col] == -1) {
      return;
    }
    if (grid[row][col] > steps) {
      grid[row][col] = steps;
    } else {
      return;
    }
    // recursion going up
    recursion(row - 1, col, steps + 1);
    // recursion going up/right
    recursion(row - 1, col + 1, steps + 1);
    // recursion going right
    recursion(row, col + 1, steps + 1);
    // recursion going right/down
    recursion(row + 1, col + 1, steps + 1);
    // recursion going down
    recursion(row + 1, col, steps + 1);
    // recursion going down/left
    recursion(row + 1, col - 1, steps + 1);
    // recursion going left
    recursion(row, col - 1, steps + 1);
    // recursion going left/up
    recursion(row - 1, col - 1, steps + 1);
  }
}
