public class Generica {
  public static void main(String[] args) {
    GenericClass<String> instance = new GenericClass<>("Test");
    instance.greet();
  }
}

class GenericClass<T> {
  T x;

  GenericClass(T x) {
    this.x = x;
  }

  <U> void greet() {
    System.out.println("hello");
  }
}