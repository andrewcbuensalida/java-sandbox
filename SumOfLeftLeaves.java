import java.util.ArrayList;
import java.util.List;

public class SumOfLeftLeaves {
  public static void main(String[] args) {
    TreeNode l7 = new TreeNode(7);
    TreeNode l15 = new TreeNode(15);
    TreeNode l20 = new TreeNode(20, l15, l7);
    TreeNode l9 = new TreeNode(9);
    TreeNode l3 = new TreeNode(3, l9, l20);
    SumOfLeftLeaves s = new SumOfLeftLeaves();
    int result = s.sumOfLeftLeaves(l3);
    System.out.println("*********Example result:\n" + result);

  }

  public int sumOfLeftLeaves(TreeNode root) {
    int sum = 0;
    List<TreeNodeWithIsLeft> queue = new ArrayList<>();
    TreeNodeWithIsLeft newRoot = new TreeNodeWithIsLeft(root.val, root.left, root.right, false);
    queue.add(newRoot);
    // while there are nodes in the queue to check BFS
    while (queue.size() != 0) {
      TreeNodeWithIsLeft currentNode = queue.remove(0);
      System.out.println(currentNode);
      // if it's a leaf, add val to sum
      if (currentNode.left == null && currentNode.right == null && currentNode.isLeft) {
        System.out.println("adding sum + val: " + (sum + currentNode.val) );
        sum += currentNode.val;
      }
      // if there's a left node, mark that it's a left node, then add to queue
      if (currentNode.left != null) {
        queue.add(new TreeNodeWithIsLeft(currentNode.left.val, currentNode.left.left, currentNode.left.right, true));
      }
      // if there's a right node, add to queue
      if (currentNode.right != null) {
        queue
            .add(new TreeNodeWithIsLeft(currentNode.right.val, currentNode.right.left, currentNode.right.right, false));
      }
    }
    return sum;
  }
}

class TreeNodeWithIsLeft extends TreeNode {
  boolean isLeft;

  public TreeNodeWithIsLeft(int val, TreeNode left, TreeNode right, boolean isLeft) {
    super(val, left, right);
    this.isLeft = isLeft;
  }

  @Override
  public String toString() {
    return "TreeNodeWithIsLeft{" +
        "val=" + val +
        ", isLeft=" + isLeft +
        '}';
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}