import java.util.HashMap;

public class FindDuplicateElementsBetweenTwoArray {

    public static void findDuplicate(int[] a1, int [] a2){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i:a1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Integer i:a2){
            map.put(i,map.getOrDefault(i,0)-1);
            if (map.get(i)==0){
                System.out.println("Duplicate numbers are : "+i);
            }
        }

    }

    public static void main(String[] args) {

        int[] a1 = {1,2,3,4};
        int[] a2 = {3,4,5,6};
        findDuplicate(a1,a2);
    }
}
