public class ValidPalindrome {
  public static void main(String[] args) {
    String str = "A man, a plan, a canal: Panama";
    System.out.println(palindrome(str));

  }

  static boolean palindrome(String str) {
    // String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    // for (int i = 0; i < s.length() / 2; i++) {
    // if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
    // return false;
    // }
    // }
    // return true;

    // TwoPointers Approach-

    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
      while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
        start++;
      }
      while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
        end--;
      }

      if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
