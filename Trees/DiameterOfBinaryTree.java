public class DiameterOfBinaryTree {
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }

    int lh = height(root.left);
    int rh = height(root.right);

    return Math.max(lh, rh) + 1;

  }

  public static int diameter1(Node root) { // O(n^2)
    if (root == null) {
      return 0;
    }

    int ldia = diameter1(root.left);
    int rdia = diameter1(root.right);

    int lh = height(root.left);
    int rh = height(root.right);

    int dia = lh + rh + 1;

    return Math.max(dia, Math.max(ldia, rdia));
  }

  static class Info {
    int d;
    int ht;

    public Info(int d, int ht) {
      this.d = d;
      this.ht = ht;
    }
  }

  public static Info diameter2(Node root) { // O(n)
    if (root == null) {
      return new Info(0, 0);
    }

    Info lInfo = diameter2(root.left);
    Info rInfo = diameter2(root.right);

    int d = Math.max(Math.max(lInfo.d, rInfo.d), lInfo.ht + rInfo.ht + 1);
    int ht = Math.max(lInfo.ht, rInfo.ht) + 1;
    return new Info(d, ht);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    System.out.println(diameter1(root));
  }
}

// class Solution {
// int res = 0;

// public int diameterOfBinaryTree(TreeNode root) {
// dfs(root);
// return res;
// }

// private int dfs(TreeNode root) {
// if (root == null) {
// return 0;
// }

// int l = dfs(root.left);
// int r = dfs(root.right);

// res = Math.max(res, l + r);

// return 1 + Math.max(l, r);
// }
// }
