import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateInArray {

    public static void main(String[] args) {

        int[] a = {1, 3, 2, 3, 4, 1};

        HashMap<Integer,Integer> m = new HashMap<>();
        for (int n:a){
            m.put(n,m.getOrDefault(n,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry :m.entrySet()){
            if (entry.getValue()>1){
                System.out.println("Duplicates Values are "+entry.getKey());
            }
        }
    }
}
