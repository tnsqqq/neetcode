import java.util.*;

public class ContainsDuplicate {

  public static boolean containsDuplicate(int nums[]) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        return true;
      }
    }
    return false;

  }

  public static void main(String[] args) {

    int nums[] = { 1, 2, 3, 4 };

    boolean hasDuplicate = containsDuplicate(nums);

    System.out.println(hasDuplicate);

  }

}

// public boolean containsDuplicate(int[] nums) {
// Set<Integer> n = new HashSet<>();

// for (int num : nums) {
// if (n.contains(num))
// return true;

// n.add(num);

// }
// return false;
// }

// Space Complexity- O(n)
// Time Complexity- O(n)