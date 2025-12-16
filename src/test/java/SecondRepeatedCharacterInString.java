import java.util.HashMap;
import java.util.Map;

public class SecondRepeatedCharacterInString {

    public static void secondMostRepeatedCharacter(String s) {

        int firstMax = 0;
        int secondMax = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > firstMax) {
                secondMax = firstMax;
                firstMax = entry.getValue();
                //secondMax=firstMax;
                //System.out.println(entry.getKey() + "=" + entry.getValue());
            } else if (entry.getValue() > secondMax && entry.getValue() != firstMax) {
                secondMax = entry.getValue();
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()==secondMax)
                System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    public static void main(String[] args) {

        String s = "vvvvhhhaa";
        secondMostRepeatedCharacter(s);
    }
}
