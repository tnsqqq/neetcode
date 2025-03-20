// import java.util.*;

// public class ValidParenthesis {

// public static void main(String[] args) {
// String s = "()";
// System.out.println(isValid(s));
// }

// static boolean isValid(String s) {
// Stack<Character> stack = new Stack<Character>();
// for (char c : s.toCharArray()) {
// if (c == '(') {
// stack.push(')');
// } else if (c == '{') {
// stack.push('}');
// } else if (c == '[') {
// stack.push(']');
// } else if (stack.isEmpty() || stack.pop() != c) {
// return false;
// }
// }
// return stack.isEmpty();
// }}

import java.util.*;

public class ValidParenthesis {

  public static void main(String[] args) {
    String s = "()";
    System.out.println(isValid(s));
  }

  static boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        if (stack.isEmpty() ||
            (c == ')' && stack.pop() != '(') ||
            (c == '}' && stack.pop() != '{') ||
            (c == ']' && stack.pop() != '[')) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
