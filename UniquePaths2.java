public class UniquePaths2 {
  int output = 0;

  public static void main(String[] args) {
    // int[][] grid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
    int[][] grid = { { 0, 1 } };
    UniquePaths2 u = new UniquePaths2();
    int output = u.uniquePathsWithObstacles(grid);
    System.out.println("*********Example output:\n" + output);

  }

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    recursiveExplorer(obstacleGrid, 0, 0);
    return output;
  }

  void recursiveExplorer(int[][] grid, int xPosition, int yPosition) {
    // if out of bounds, return
    if (yPosition < 0 || xPosition >= grid[0].length || yPosition >= grid.length || xPosition < 0) {
      return;
    }
    // if obstacle, return
    if (grid[yPosition][xPosition] == 1) {
      return;
    }
    // if destination, add to output
    if (yPosition == grid.length - 1 && xPosition == grid[0].length - 1) {
      output++;
      return;
    }
    // deep copy grid
    int[][] newGrid = new int[grid.length][];
    for (int i = 0; i < grid.length; i++) {
      newGrid[i] = grid[i].clone();
    }
    // move right
    recursiveExplorer(newGrid, xPosition + 1, yPosition);
    // move down
    recursiveExplorer(newGrid, xPosition, yPosition + 1);
  }
}