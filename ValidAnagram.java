public class ValidAnagram {

  public static boolean validAnagram(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
      count[t.charAt(i) - 'a']--;
    }

    for (int val : count) {
      if (val != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    String s = "racecar";
    String t = "carrace";

    // boolean isValid = validAnagram(s, t);

    // System.out.println(isValid);

    System.out.println(validAnagram(s, t));

  }

}
