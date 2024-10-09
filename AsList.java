import java.util.Arrays;
import java.util.List;

public class AsList {
  public static void main(String[] args) {
    String name[] = { "a", "100", null };
    List<String> names = Arrays.asList(name);
    System.out.println(name.getClass());
    System.out.println(names.getClass());
    System.out.println(names);
    String[] namesArray = names.toArray(new String[0]);
    System.out.println(Arrays.toString(namesArray));
    List<String> namesList = Arrays.asList("a");
    System.out.println(namesList);
    Fruit apple = new Fruit("apple", "red");
    System.out.println(apple);
    apple.squeeze("a", "b", "c");
    // System.out.println(Arrays.asList(null));// NullPointerException
    String color[]= new String[]{"green", "yellow"}; // can't specifiy a size if you're going to initialize it
    color[0] = "red";
    System.err.println(Arrays.asList(color));
    String city[] = new String[2];
    city[0] = "New York";
    System.out.println(Arrays.asList(city));
  }

  public static class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color) {
      this.name = name;
      this.color = color;
    }

    public String squeeze(String... myArgs) {
      System.out.println("These are my args: " + Arrays.toString(myArgs));
      return "Squeezing the " + name + "!";
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }

    @Override
    public String toString() {
      return "Fruit{name='" + name + "', color='" + color + "'}";
    }
  }

}