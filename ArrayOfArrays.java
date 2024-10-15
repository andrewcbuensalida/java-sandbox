public class ArrayOfArrays {
  public static void main(String[] args) {
    String a[][] = {{"a","b"},{"c","d"}}; // could do double brackets after String too
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
