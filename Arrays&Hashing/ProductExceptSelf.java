import java.util.Arrays;

public class ProductExceptSelf {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int[] product = productOfArray(nums);
    System.out.println(Arrays.toString(product));
  }

  static int[] productOfArray(int[] nums) {

    int n = nums.length;
    int[] ans = new int[n];
    int[] prefix = new int[n];
    int[] suffix = new int[n];
    prefix[0] = 1;
    suffix[n - 1] = 1;

    // prefix
    for (int i = 1; i < n; i++) {
      prefix[i] = prefix[i - 1] * nums[i - 1];
    }

    // suffix
    for (int i = n - 2; i >= 0; i--) {
      suffix[i] = suffix[i + 1] * nums[i + 1];
    }

    // product of prefix and suffix
    for (int i = 0; i < n; i++) {
      ans[i] = prefix[i] * suffix[i];
    }
    return ans;
  }
}
