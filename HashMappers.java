import java.util.HashMap;

public class HashMappers {
    public static void main(String[] args) {
        HashMap<String,String> m1 = new HashMap<>();
        m1.put("a","b");
        m1.put("c","d");
        m1.put("e","f");
        m1.put("e","g");
        m1.clone();
        m1.remove("c");
        System.out.println(m1.get("a"));
        System.out.println(m1);

    }
}

