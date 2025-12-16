import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordPatternMatch {
    public static boolean wordPattern(String pattern, String s) {
        String[] s1=s.split(" ");
        Map<Character,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for (char c: pattern.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for (String s2: s1){
            map2.put(s2,map2.getOrDefault(s2,0)+1);
        }
        Set<Character> keys= map1.keySet();
        Set<String> keys1= map2.keySet();
        if (keys.size()==keys1.size()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        String s1= "dog cat cat fish";
        boolean b = wordPattern(pattern,s);
        boolean b1 = wordPattern(pattern,s1);
        System.out.println(b);
        System.out.println(b1);
    }
}
