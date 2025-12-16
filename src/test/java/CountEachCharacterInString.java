import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountEachCharacterInString {

    public static void countChar(String s){

        s=s.replaceAll("//s","").toLowerCase();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    public static void main(String[] args) {

        String s = "Apple";
        countChar(s);
    }
}
