public class BalancedBinaryTree {
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // public static int height(Node root) { // O(N^2)
  // if (root == null) {
  // return 0;
  // }

  // int lh = height(root.left);
  // int rh = height(root.right);

  // return Math.max(lh, rh) + 1;

  // }

  // public static boolean balanced(Node root) {
  // if (root == null) {
  // return true;
  // }

  // int lh = height(root.left);
  // int rh = height(root.right);

  // if (Math.abs(lh - rh) > 1) {
  // return false;
  // }

  // // Check if left and right subtrees are balanced too
  // return balanced(root.left) && balanced(root.right);
  // }

  public static boolean balanced(Node root) { // O(N)
    return checkHeight(root) != -1;
  }

  public static int checkHeight(Node root) {
    if (root == null) {
      return 0;
    }

    int lh = checkHeight(root.left);
    if (lh == -1) {
      return -1;
    }

    int rh = checkHeight(root.right);
    if (rh == -1) {
      return -1;
    }

    if (Math.abs(lh - rh) > 1) {
      return -1;
    }

    return Math.max(lh, rh) + 1;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    System.out.println(balanced(root));
  }
}
