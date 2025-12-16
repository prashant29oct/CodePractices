import java.util.HashMap;
import java.util.Map;

public class AnagramString {

    public static boolean anagramString(String s1, String s2){

        s1 = s1.replaceAll("//s","").toLowerCase();
        s2 = s2.replaceAll("//s","").toLowerCase();

        if (s1.length()!=s2.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(char c: s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c:s2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "Silent";
        String s2 = "listen";

        if (anagramString(s1,s2)){
            System.out.println("String is anagram");
        }
        else {
            System.out.println("String is not anagram");
        }
    }
}
