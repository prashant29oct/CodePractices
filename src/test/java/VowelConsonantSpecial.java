public class VowelConsonantSpecial {

    public static String rearrange(String s){

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        StringBuilder specials = new StringBuilder();

        for(char c:s.toCharArray()){
            if(isVowel(c)){
                vowels.append(c);
            } else if (Character.isLetter(c)) {
                consonants.append(c);
            }
            else {
                specials.append(c);
            }
        }
        return vowels.toString()+consonants.toString()+specials.toString();
    }

    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
               return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String input = "aB@c#Def!o1";
        System.out.println(rearrange(input));
    }
}
