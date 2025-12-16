public class ReverseOfStringUsingRecurssion {

    public static void reverseOfString(char[] s, int i, int j){
        if (i>j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverseOfString(s,i+1,j-1);
    }

    public static void main(String[] args) {

        String s = "prashant";
        char[] ch = s.toCharArray();
        reverseOfString(ch,0,s.length()-1);
        String rev = new String(ch);
        System.out.println(rev);
    }
}
