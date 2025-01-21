import java.util.Arrays;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {

    int[] nums = { 2, 7, 11, 5 };

    int[] result = twoSum(nums, 9);

    if (result != null) {
      System.out.println(Arrays.toString(result));
    } else {
      System.out.println("no solution");
    }

  }
}
