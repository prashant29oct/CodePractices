import java.util.HashMap;

public class LastRepeatingCharacter {

    public static void findLastRepeatingCharacter(String str){

        str=str.toLowerCase();
        str=str.replaceAll("//s","");

        HashMap<Character,Integer> map = new HashMap<>();
        for (char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i=str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            if (map.get(c)>1){
                System.out.println("Last Repeating Character is:  " + c + " with count:  " + map.get(c));
                break;
            }
            else {
                System.out.println("No repeating characters found");
            }
        }
    }

    public static void main(String[] args) {

        String s = "programming";
        findLastRepeatingCharacter(s);
    }
}
