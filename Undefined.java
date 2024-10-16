public class Undefined {
  public static void main(String[] args) {
    ListNode l = new ListNode();
    l.val = 10;
    System.out.println("ListNode value: " + l.val);
    
  }
}

class ListNode {
  int val;
  ListNode next;
  boolean isLeft;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}