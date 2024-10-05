import java.util.Arrays;

public class Copilot {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] arr1 = {1, 2, 3};
        System.out.println(Arrays.toString(arr1));


        printFibonacci(10);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
