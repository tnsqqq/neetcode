import java.util.*;

public class TopKFrequentElements {

  public int[] topK(int[] nums, int k) {

    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int n : nums) {
      frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
    }

    List<Integer>[] bucket = new List[nums.length + 1];
    for (int key : frequencyMap.keySet()) {
      int frequency = frequencyMap.get(key);
      if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(key);
    }

    int[] res = new int[k];
    int counter = 0;

    for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
      if (bucket[pos] != null) {
        for (Integer integer : bucket[pos]) {
          res[counter++] = integer;
        }
      }
    }
    return res;

  }

  public static void main(String[] args) {

    TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    int[] nums = { 1, 1, 1, 2, 3, 3, 3 };
    int k = 2;

    int[] result = topKFrequentElements.topK(nums, k);

    System.out.println(Arrays.toString(result));

  }
}
