import java.util.LinkedList;

class SumOfLeftLeavesLinkedListNode {
  public static void main(String[] args) {
    TreeNode l7 = new TreeNode(7);
    TreeNode l15 = new TreeNode(15);
    TreeNode l20 = new TreeNode(20, l15, l7);
    TreeNode l9 = new TreeNode(9);
    TreeNode l3 = new TreeNode(3, l9, l20);
    SumOfLeftLeaves s = new SumOfLeftLeaves();
    long startTime = System.nanoTime();
    int result = s.sumOfLeftLeaves(l3);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println("Execution time in nanoseconds: " + duration);
    System.out.println("*********Example result:\n" + result);

  }

  public int sumOfLeftLeaves(TreeNode root) {
    int sum = 0;
    LinkedList<TreeNodeWithIsLeft> queue = new LinkedList<>();
    TreeNodeWithIsLeft newRoot = new TreeNodeWithIsLeft(root, false);
    queue.add(newRoot);
    // while there are nodes in the queue to check BFS
    while (queue.size() != 0) {
      TreeNodeWithIsLeft currentNode = queue.poll();
      // if it's a leaf, add val to sum
      if (currentNode.node.left == null && currentNode.node.right == null && currentNode.isLeft) {
        sum += currentNode.node.val;
      }
      // if there's a left node, mark that it's a left node, then add to queue
      if (currentNode.node.left != null) {
        queue.add(new TreeNodeWithIsLeft(currentNode.node.left, true));
      }
      // if there's a right node, add to queue
      if (currentNode.node.right != null) {
        queue
            .add(new TreeNodeWithIsLeft(currentNode.node.right, false));
      }
    }
    return sum;
  }
}

class TreeNodeWithIsLeft extends TreeNode {
  TreeNode node;
  boolean isLeft;

  public TreeNodeWithIsLeft(TreeNode node, boolean isLeft) {
    this.node = node;
    this.isLeft = isLeft;
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