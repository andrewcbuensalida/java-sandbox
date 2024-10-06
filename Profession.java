public class Profession {
  private String name;
  private double salary;

  private Profession(Builder builder) {
    this.name = builder.name;
    this.salary = builder.salary;
  }

  public static class Builder {
    private String name;
    private double salary;

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setSalary(double salary) {
      this.salary = salary;
      return this;
    }

    public Profession build() {
      return new Profession(this);
    }
  }

  @Override
  public String toString() {
    return "Profession{" +
        "name='" + name + '\'' +
        ", salary=" + salary +
        '}';
  }
}
