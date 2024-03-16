import java.util.Optional;

public class OptionalClass {
    static String name;
    static int age;
    static String[] names = {"A", "B"};

    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Hello");
        System.out.println(opt.get());
        System.out.println(name);
        System.out.println(age);
        names[2] = "C";
        System.out.println(names[0]);
    }
}
