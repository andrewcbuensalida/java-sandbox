import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
    if (result != null) {
      System.out.println("Indices: " + result[0] + ", " + result[1]);
    } else {
      System.out.println("No solution found.");
    }
  }
  public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // loop through nums
        for(int i = 0; i < nums.length; i++){
            Integer pairNum = map.get(nums[i]);
            // check if current num is in map
            if(pairNum != null){
                // return current index and value in map
                return new int[]{pairNum,i};
            }
            // save the pair number
            map.put(target-nums[i],i);
        }
        return null;
    }
}
