import java.util.Arrays;

public class ProductOfArray {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int[] product = productOfArray(nums);
    System.out.println(Arrays.toString(product));
  }

  static int[] productOfArray(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    for (int i = 0, left = 1; i < n; i++) {
      ans[i] = left;
      left *= nums[i];
    }
    for (int i = n - 1, right = 1; i >= 0; i--) {
      ans[i] *= right;
      right *= nums[i];
    }
    return ans;
  }
}