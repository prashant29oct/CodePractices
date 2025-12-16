import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindCommonElementInArray {

    public static void main(String[] args) {

        int[] a = {2,3,4,5};
        int[] b = {8,6,5,1,4};

        Set<Integer> s1 = new HashSet<>();
        for (int num : a){
            s1.add(num);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int num:b){
            if (s1.contains(num)){
                s2.add(num);
            }
        }
        System.out.println(s2);

        findCommandElementUsingHashMap(a,b);
    }

    public static void findCommandElementUsingHashMap(int[] a1, int[] a2){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer n:a1){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for (Integer n:a2){
            map.put(n,map.getOrDefault(n,0)+1);
            if (map.get(n)>1){
                System.out.println("Command elements is : "+n);
            }
        }
    }
}
