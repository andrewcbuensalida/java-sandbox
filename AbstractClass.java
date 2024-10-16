public class AbstractClass {
  public static void main(String[] args) {
    MyAbstract.staticMethod();
    SubAbstract sub = new SubAbstract();
    sub.notStaticMethod();
    SubAbstract.staticMethod();
    sub.staticMethod2();
    sub.genericMethod("helloooooo");
  }
}

abstract class MyAbstract {
  static void staticMethod() {
    System.out.println("in static method");
  }

  public void notStaticMethod() {
    System.out.println("in not static");
  }

  abstract void staticMethod2();

  public <T,U> void genericMethod(T x){
    System.out.println("world");
  }
}

class SubAbstract extends MyAbstract {
  static void staticMethod() { // has to be static
    System.out.println("in SubAbstract static");
  }
  void staticMethod2(){
    System.out.println("in SubAbstract staticMethod2");
  }
}