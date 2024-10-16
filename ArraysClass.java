import java.util.ArrayList;
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) { // must have a main method
        System.out.println("Arrays");

        Integer arr1[] = {1, 2, 3};
        System.out.println("length "+arr1.length);
        Arrays.sort(arr1, (a, b) -> b - a);
        
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {4,5,6};
        arr2[0] = 100;
        System.out.println(Arrays.toString(arr2));

        int arr3[] = new int[5]; // this creates an array of size 5, and all the values is 0. If you create the array like this, can't change the size.
//        arr3[5] = 100; // this will error because index is out of bounds
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {1,2,3};
//        arr4[10] = 100; // this will also error because index out of bounds

        System.out.println(Arrays.toString(arr4));

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.sort((a, b) -> b - a);
        System.out.println(al1);

        final String myString = "abcd";
        String[] myStringArray = myString.split("");
        System.out.println(myStringArray.length);
        for(String s : myStringArray){
          System.out.println(s);
        }
        System.out.println('t');

    }
}
