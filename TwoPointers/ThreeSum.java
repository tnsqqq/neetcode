import java.util.*;

public class ThreeSum {
  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4 };
    // int[] sum = threeSum(arr);
    // System.out.println(Arrays.toString(sum));

    List<List<Integer>> result = threeSum(arr);
    System.out.println(result);
  }

  static List<List<Integer>> threeSum(int[] arr) {

    // Brute Force-

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // for (int k = j + 1; k < arr.length; k++) {
    // if (arr[i] + arr[j] + arr[k] == 0) {
    // return new int[] { arr[i], arr[j], arr[k] };
    // }
    // }
    // }
    // }
    // return new int[] { -1, -1 };

    // Two Pointers-

    Arrays.sort(arr);
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < arr.length - 2; i++) {
      if (i > 0 && arr[i] == arr[i - 1]) {
        continue;
      }

      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == 0) {
          result.add(Arrays.asList(arr[i], arr[left], arr[right]));

          while (left < right && arr[left] == arr[left + 1]) {
            left++;
          }
          while (left < right && arr[right] == arr[right - 1]) {
            right--;
          }
          left++;
          right--;
        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }
    return result;
  }
}
