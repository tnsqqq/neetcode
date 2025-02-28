import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
  int min = Integer.MAX_VALUE;
  Stack<Integer> st = new Stack<>();

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    List<Object> output = new ArrayList<>();

    output.add(null); // MinStack() constructor
    minStack.push(-2);
    output.add(null);
    minStack.push(0);
    output.add(null);
    minStack.push(-3);
    output.add(null);
    output.add(minStack.getMin()); // -3
    minStack.pop();
    output.add(null);
    output.add(minStack.top()); // 0
    output.add(minStack.getMin()); // -2

    System.out.println(output);
  }

  public void push(int val) {
    if (val <= min) {
      st.push(min);
      min = val;
    }
    st.push(val);
  }

  public void pop() {
    if (st.pop() == min) {
      min = st.pop();
    }

  }

  public int top() {
    return st.peek();
  }

  public int getMin() {
    return min;
  }
}