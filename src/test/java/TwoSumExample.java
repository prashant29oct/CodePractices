import java.util.HashMap;

public class TwoSumExample {

    public static int[] findTwoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int compliment = target-nums[i];
            if (map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] a = {2,5,6,7,9};
        int target = 12;

        int[] resultLength = findTwoSum(a,target);
        if (resultLength.length>0){
            System.out.println("Indices: " + resultLength[0] + " , " + resultLength[1]);
            System.out.println("index " + a[resultLength[0]] + " , " + a[resultLength[1]]);
        }
    }
}
