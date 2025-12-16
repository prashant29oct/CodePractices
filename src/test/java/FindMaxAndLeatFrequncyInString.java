import java.util.HashMap;
import java.util.Map;

public class FindMaxAndLeatFrequncyInString {

    public static void findFrequncy(String s) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        s = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 1) {
                int value = entry.getValue();
                if (value > max) {
                    max = value;
                }
                else if (value<min){
                    min=value;
                }
            }
        }

        System.out.println("Max Freq is " + max);
        System.out.println("Min Freq is " + min);
    }

    public static void main(String[] args) {

        String s = "aaabbc";
        findFrequncy(s);
    }
}
