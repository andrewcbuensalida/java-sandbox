public class Split {
  public static void main(String[] args) {
    String s = "hello";
    s.length();
    String[] split = s.split("");
    for (String part : split) {
      System.out.println(part);
    }
  }
}
