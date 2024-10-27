public class Disease{
  private String name;
  private Integer mortalityRate;
 
  private Disease(Builder builder) {
    this.name = builder.name;
    this.mortalityRate = builder.mortalityRate;
  }

  // don't need this method if doing new Disease.Builder()
  public static Builder builder() {
    return new Builder();
  }

  public static class Builder{
    private String name;
    private Integer mortalityRate;
 
    public Builder name(String name) {
      this.name = name;
      return this;
    }
 
    public Builder mortalityRate(Integer mortalityRate) {
      this.mortalityRate = mortalityRate;
      return this;
    }
 
    public Disease build() {
      return new Disease(this);
    }
  }

  @Override
  public String toString() {
    return "Disease{name='" 
    + name 
    + "', mortalityRate=" 
    + mortalityRate + "}";
  }
}