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
    int left = 1;
    int right = 1;
    for (int i = 0; i < n; i++) {
      ans[i] = left;
      left *= nums[i];
    }
    for (int i = n - 1; i >= 0; i--) {
      ans[i] *= right;
      right *= nums[i];
    }
    return ans;

  }
}