public class ArrayOfArrays {
  public static void main(String[] args) {
    int a[][] = { { 1, 2 }, { 3, 4 } }; // could do double brackets after String too
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    int[][] b = new int[a.length][];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i].clone();
    }

    // Print the deep copied array to verify
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }

    String s = "hello";
    
    String sCopy = s;
    String result = sCopy.replace("h", "i");
    System.out.println(result);
  }
}
