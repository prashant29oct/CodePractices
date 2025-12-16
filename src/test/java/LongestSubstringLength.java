import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {

    public static void main(String[] args) {

        String s = "pwwkew";
        int maxLength = 0;

        for (int i=0; i<s.length(); i++){
            int length = 0;
            Set<Character> set = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                if (set.add(s.charAt(j))){
                    length++;
                }
                else if(!set.add(s.charAt(j))){
                    break;
            }
        }
            if (length>maxLength){
                maxLength=length;
            }
    }
        System.out.println(maxLength);
}
}
