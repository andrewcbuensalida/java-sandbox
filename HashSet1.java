import java.util.HashSet;

public class HashSet1 {
  public static void main(String[] args) {
    HashSet<String> h = new HashSet<>();
    h.add("a");
    h.add("b");
    System.out.println("*********Example h.contains(\"b\"):\n" + h.contains("b"));
    h.remove("b");
    System.out.println(h);
  }
}
