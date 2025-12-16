public class ReverseVowelsOfString {

    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j){
           if (isVowel(ch[i])==true && isVowel(ch[j])==true){
               char temp = ch[j];
               ch[j]=ch[i];
               ch[i]=temp;
               i++;
               j--;
           } else if (isVowel(ch[i])==true && isVowel(ch[j])==false) {
               j--;
           }else {
               i++;
           }
        }
        String s1 = new String(ch);
        return s1;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        reverseVowels(s);
    }
}
