public class MyBuilder {
  public static void main(String[] args) {
    Disease disease = Disease
      .builder()
      .name("Ebola")
      .mortalityRate(50)
      .build();
    System.out.println(disease);

    Profession profession = new Profession
      .Builder()
      .setName("Software Developer")
      .setSalary(100000)
      .build();
    System.out.println(profession);
  }
}

