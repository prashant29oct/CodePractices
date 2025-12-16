import java.util.HashMap;

public class FindPairSum {

    public static void pairSum(int [] a, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer i:a){
            int complimentry = sum-i;
            if (map.containsKey(complimentry)){
                System.out.println("("+complimentry+","+i+")");
            }
            else {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
    }

    public static void main(String[] args) {
         int [] a = {1,5,7,-1,2};
         int sum = 6;
         pairSum(a,sum);
    }
}
