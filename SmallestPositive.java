import java.util.LinkedHashSet;

public class SmallestPositive {
    public static void main(String[] args) {

        int[] a = {2, 5, 7, 4, 2, 7, 1};
        int result = solution(a);
        System.out.println("This is result: " + result);
    }

    public static int solution(int[] A) {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < A.length; i++)
            set.add(A[i]);

        int result = 0;
        System.out.print(set);
        for (int i = 1; i < set.size(); i++) {
            if (!set.contains(i)) {
                result = i;
            }
        }
        return result;
    }
}
