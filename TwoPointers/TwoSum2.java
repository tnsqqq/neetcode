import java.util.Arrays;

public class TwoSum2 {
  public static void main(String[] args) {
    int arr[] = { 2, 7, 11, 15 };
    System.out.println(Arrays.toString(twosum(arr, 9)));
  }

  static int[] twosum(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int sum = arr[left] + arr[right];

      if (sum == target) {
        // Return 1-based indices as per some versions of the problem
        return new int[] { left + 1, right + 1 };
      } else if (sum < target) {
        left++; // Increase the sum by moving left pointer to the right
      } else {
        right--; // Decrease the sum by moving right pointer to the left
      }
    }
    return new int[] { -1, -1 }; // No solution found
  }
}
