import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String s){

        s = s.replaceAll("//s","").toLowerCase();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c: s.toCharArray()){
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c: set){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "Programming";
        System.out.println(removeDuplicates(s));
    }
}
