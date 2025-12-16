import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordPatternMatch {
    public static boolean wordPattern(String pattern, String s) {
        String[] s1=s.split(" ");
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        if (s1.length!=pattern.length()){
            return false;
        }
        for (int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = s1[i];

            if (map1.containsKey(ch)){
                if (!map1.get(ch).equals(word)){
                    return false;
                }
            }
            else {
                map1.put(ch,word);
            }

            if (map2.containsKey(word)){
                if(map2.get(word)!=ch){
                    return false;
                }
            }
            else {
                map2.put(word,ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        //String pattern1 = "aba";
        String s = "dog cat cat dog";
        //String s1 = "cat cat cat dog";
        //String s1= "dog cat cat fish";
        boolean b = wordPattern(pattern,s);
        //boolean b1 = wordPattern(pattern,s1);
        System.out.println(b);
        //System.out.println(b1);
    }
}
