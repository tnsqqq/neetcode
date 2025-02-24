public class ContainerWithMostWater {
  public static void main(String[] args) {
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxArea(height));
  }

  static int maxArea(int[] height) {
    int max = 0;
    int i = 0;
    int j = height.length - 1;

    while (i < j) {
      int area = Math.min(height[i], height[j]) * (j - i);
      max = Math.max(max, area);

      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return max;
  }

}
