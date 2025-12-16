import java.util.HashMap;

public class RepeatedWord {

    public static void firstRepeatedWordInSentence(String s){

        String[] s1 = s.split(" ");

        HashMap<String,Integer> map = new HashMap<>();
        for (String word:s1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (String word:s1){
            if (map.get(word)>1){
                System.out.println("Repeated word is : "+word);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String s = "My name is Prashant and Prashant have good habit";
        firstRepeatedWordInSentence(s);
    }
}
