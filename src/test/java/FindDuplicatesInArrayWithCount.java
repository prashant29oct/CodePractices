import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArrayWithCount {

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 2, 5, 7, 5, 4, 3, 2,2,3,4};

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int x : a) {
            m.put(x,m.getOrDefault(x,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry:m.entrySet()){

            if (entry.getValue()>=2){
                System.out.println("Key -> " + entry.getKey() + "  Value -> " +entry.getValue());
            }
        }
    }
}
