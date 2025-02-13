// import java.util.Arrays;

// public class LongestConsecutiveSequence {
//   public static void main(String[] args) {
//     int[] nums = { 100, 4, 200, 1, 3, 2 };
//     System.out.println(longestConsecutive(nums));

//   }

//   static int longestConsecutive(int[] nums) {
//     if (nums.length == 0) {
//       return 0;
//     }

//     Arrays.sort(nums);

//     int max = 1;
//     int temp = 1;

//     for (int i = 0; i < nums.length - 1; i++) {
//       if (nums[i] == nums[i + 1]) {
//         continue;
//       } else if (nums[i] + 1 == nums[i + 1]) {
//         temp++;
//       } else {
//         max = Math.max(max, temp);
//         temp = 1;
//       }
//     }
//     // return max > temp ? max : temp;
//     // return max;
//     return Math.max(max, temp);
//   }
// }

// HashSet

import java.util.*;

public class LongestConsecutiveSequence {
  public static void main(String[] args) {
    int[] nums = { 100, 4, 200, 1, 3, 2 };
    System.out.println(longestConsecutive(nums));

  }

  static int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    // Add all numbers to a HashSet
    Set<Integer> numSet = new HashSet<>();
    for (int num : nums) {
      numSet.add(num);
    }

    int maxLength = 0;

    // Check each number
    for (int num : numSet) {
      // Only start counting if it's the start of a sequence
      if (!numSet.contains(num - 1)) {
        int currentNum = num;
        int currentStreak = 1;

        // Count the length of the sequence
        while (numSet.contains(currentNum + 1)) {
          currentNum++;
          currentStreak++;
        }
        maxLength = Math.max(maxLength, currentStreak);
      }
    }
    return maxLength;
  }
}
