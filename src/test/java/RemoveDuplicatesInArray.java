import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

    public static void removeDuplicatesInArray(int[] a){

        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for (int num : a){

            s.add(num);
        }
        System.out.println(s);
        System.out.println(s.size());
    }
    public static int removeDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i: nums){
            s.add(i);
        }
        return s.size();
    }

    public static void main(String[] args) {

        //int[] a={1,2,3,4,4,4,5,6,6};
        //removeDuplicatesInArray(a);

        int[] b = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(b));
    }
}
