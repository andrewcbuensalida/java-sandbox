import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(200);
        nums.add(100);
        nums.add(300);

        int s = nums.size();
        System.out.println(s);
        for(int num : nums){
            System.out.println(num);
        }
        boolean c = nums.contains(200);
        System.out.println(c);
        System.out.println(nums);
    }
}
