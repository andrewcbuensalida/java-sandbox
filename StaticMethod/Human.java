package StaticMethod;

public class Human {
  String name;
  protected int age;
  static String hero = "Superman";

  public Human(String name, int age) {
    System.out.println();
    this.name = name;
    this.age = age;
  }

  public void greet() {
    System.out.println("Hi my name is " + name + " and my age is " + age);
  }

  static void greet2() {
    // System.out.println("Hi my name is " + name + " and my age is " + age); //
    // errors. properties have to be static
    System.out.println("I am " + hero);
  }

  @Override
  public String toString() {
    return "Human{name='" + name + "'}";
  }
}