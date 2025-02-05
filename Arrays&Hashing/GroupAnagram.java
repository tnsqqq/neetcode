import java.util.*;

public class GroupAnagram {

  public List<List<String>> groupAnagram(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
      int[] count = new int[26];
      for (char c : s.toCharArray()) {
        count[c - 'a']++;
      }

      String key = Arrays.toString(count);

      map.putIfAbsent(key, new ArrayList<>());
      map.get(key).add(s);
    }

    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {
    GroupAnagram groupAnagram = new GroupAnagram();
    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

    List<List<String>> result = groupAnagram.groupAnagram(strs);

    System.out.println(result);
  }
}
