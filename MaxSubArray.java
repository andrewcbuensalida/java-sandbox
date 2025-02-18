
import java.util.*;
import java.io.*;

public class MaxSubArray {
  public static List<Integer> subArray(List<Integer> ar) {
    List<Integer> maxSubArray = new ArrayList<>();
    List<Integer> currentSubArray = new ArrayList<>();
    int currentSum = 0;
    int currentLength = 0;
    int maxSum = 0;
    int maxLength = 0;

    // loop through ar
    for (int i = 0; i < ar.size(); i++) {
      int currentNum = ar.get(i);

      // if number is positive, add to current subArray
      if (currentNum > 0) {
        currentSubArray.add(currentNum);
        currentSum += currentNum;
        currentLength++;
      }
      // if end of subarray, aka number is negative or end of array
      if (currentNum <= 0 || i == ar.size() - 1) {
        System.out.println("hello");
        // check if current subArray's sum is greater than maxSubArray
        if (currentSum > maxSum) {
          maxSubArray = new ArrayList<>(currentSubArray);
          maxSum = currentSum;
          maxLength = currentLength;
        }
        // else if current subArray's sum is equal to maxSubArray and current subArray's
        // length is greater than maxSubArray
        else if (currentSum == maxSum && currentLength > maxLength) {
          maxSubArray = new ArrayList<>(currentSubArray);
          maxSum = currentSum;
          maxLength = currentLength;

        }
        currentSubArray.clear();
        currentSum = 0;
        currentLength = 0;
      }
    }
    // if length of maxSubArray is 0, return -1
    if (maxSubArray.size() == 0) {
      maxSubArray.add(-1);
    }
    return maxSubArray; // return type "List<Integer>".
  }

  public static void main(String[] args) throws IOException {
    System.out.println("starting ");
    List<Integer> ar = new ArrayList<>(Arrays.asList(-4, 4, 3, -5, 2, 4, 1));

    List<Integer> outcome = MaxSubArray.subArray(ar);

    System.out.println(outcome);
  }

}
