public class ClassClass {
    int num = 1;
    String name;

    //    @Override
//    public String toString(){
//        System.out.println("asdf");
//        return "aaaa";
//    }
    public static void main(String[] args) {
        ClassClass c = new ClassClass();
        System.out.println("this is c: " + c);
        System.out.println(c.getClass());
    }

    @Override
    public String toString() {
        return "ClassClass{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
