public class defaultArgWithType {
  public static void main(String[] args) {
    add(1);
  }
  private static void add(int a, int b) {
    System.out.println(a + b);
  }
  private static void add(int a) {
    add(a, 100);
  }
}
