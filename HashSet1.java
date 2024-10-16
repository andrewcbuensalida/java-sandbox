import java.util.HashSet;

public class HashSet1 {
  public static void main(String[] args) {
    HashSet<String> h = new HashSet<>();
    h.add("a");
    h.add("b");
    System.out.println(h);
    for (String s : h) {
      System.out.println(s);
    }
  }
}
