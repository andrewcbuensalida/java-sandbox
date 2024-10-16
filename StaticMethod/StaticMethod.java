package StaticMethod;

public class StaticMethod {
  public static void main(String[] args) {
    Human h = new Human("Henry", 22);
    System.out.println(h);
    h.greet();
    Human.greet2();
  }
}
