// Brute force-

// public class TrappingRainWater {

//   public static void main(String[] args) {
//     int[] height = { 4, 2, 0, 3, 2, 5 };
//     System.out.println(trap(height));
//   }

//   static int trap(int[] height) {
//     int res = 0;

//     if (height == null || height.length < 3) {
//       return 0;
//     }

//     for (int i = 1; i < height.length - 1; i++) {

//       int lb = height[i];
//       for (int j = 0; j < i; j++) {
//         lb = Math.max(lb, height[j]);
//       }

//       int rb = height[i];
//       for (int j = i + 1; j < height.length; j++) {
//         rb = Math.max(rb, height[j]);
//       }

//       int wl = Math.min(lb, rb);
//       int tw = wl - height[i];
//       res = res + tw;

//     }
//     return res;
//   }

// }

// Two Pointers-

// public class TrappingRainWater {

//   public static void main(String[] args) {
//     int[] height = { 4, 2, 0, 3, 2, 5 };
//     System.out.println(trap(height));
//   }

//   static int trap(int[] height) {

//     if (height == null || height.length < 3) {
//       return 0;
//     }

//     int left = 0;
//     int right = height.length - 1;
//     int leftMax = 0;
//     int rightMax = 0;
//     int water = 0;

//     while (left < right) {
//       if (height[left] < height[right]) {
//         if (height[left] >= leftMax) {
//           leftMax = height[left];
//         } else {
//           water += (leftMax - height[left]);
//         }
//         left++;
//       } else {
//         if (height[right] >= rightMax) {
//           rightMax = height[right];
//         } else {
//           water += (rightMax - height[right]);
//         }
//         right--;
//       }
//     }
//     return water;
//   }
// }

public class TrappingRainWater {

  public static void main(String[] args) {
    int[] height = { 4, 2, 0, 3, 2, 5 };
    System.out.println(trap(height));
  }

  static int trap(int[] height) {

    if (height == null || height.length < 3) {
      return 0;
    }

    int left = 0;
    int right = height.length - 1;
    int leftMax = height[left];
    int rightMax = height[right];
    int water = 0;

    while (left < right) {
      if (leftMax < rightMax) {
        left++;
        leftMax = Math.max(leftMax, height[left]);
        water += leftMax - height[left];
      } else {
        right--;
        rightMax = Math.max(rightMax, height[right]);
        water += rightMax - height[right];
      }
    }
    return water;
  }
}
