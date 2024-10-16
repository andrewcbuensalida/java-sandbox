import StaticMethod.Human;
public class Strings extends Human {
    public Strings(String name, int age) {
        super(name, age);
    }
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1.append("a"));
        int num = 100;
        System.out.println(num);
        Strings h = new Strings("Andrew", 36);
        h.age = 26;
        h.greet();

        String x = new String("hi");
        String y = new String("hi");
        // String x = "hi";
        // String y = "hi";
        System.out.println(x==y);
        System.out.println(x.equals(y));
      }
}
