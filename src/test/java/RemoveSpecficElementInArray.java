import java.util.HashSet;
import java.util.Set;

public class RemoveSpecficElementInArray {

    public static void main(String[] args) {

        int[] a = {2,3,4,5,6};
        int removeElement = 4;
        Set<Integer> s = new HashSet<>();
        for (int n:a) {
            if (n != removeElement) {
                s.add(n);
            }
        }
        System.out.println(s);
    }
}
