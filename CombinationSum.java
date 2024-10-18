import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
  public static void main(String[] args) {
    int[] input = {2,3,6,7};
    List<List<Integer>> output = combinationSum(input,7);
    System.out.println(output);
  }

  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> output = new ArrayList<>();
    backtrack(output, candidates, new ArrayList<>(), target, 0);
    return output;

  }

  private static void backtrack(List<List<Integer>> output, int[] candidates, List<Integer> temp, int remain, int start) {
    if (remain < 0) {
      return;
    }
    if (remain == 0) {
      output.add(new ArrayList<>(temp));
      return;
    }
    for (int i = start; i < candidates.length; i++) {
      temp.add(candidates[i]);
      backtrack(output, candidates, temp, remain - candidates[i], i);
      temp.remove(temp.size() - 1);
    }
  }
}
