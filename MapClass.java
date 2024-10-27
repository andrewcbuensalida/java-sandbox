import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapClass {
  static class Person {
    private final String name;

    Person(String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Person p1 = new Person("Jake");
    Person p2 = new Person("Pam");

    List<Person> people = new ArrayList<>();
    people.add(p1);
    people.add(p2);
    System.out.println(people.stream().map((Person p) -> p.name).toList()); // toList() is an alternative to .collect(Collector.toList())

  }
}
