import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
  public static void main(String[] args) {
    List<String> l1 = new ArrayList<>();
    l1.add("a");
    l1.add("b");
    l1.add("c");
    System.out.println(l1);
    List<String> filtered = l1.stream().filter(s -> s != "b").collect(Collectors.toList());
    System.out.println(filtered);
    for(int i = 0; i < filtered.size(); i++){
      System.out.println(filtered.get(i));
    }
    double d = Math.pow(3.333,2);
    System.out.println(d);
  }
}
