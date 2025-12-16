public class PalindromeOfStringUsingRecurssion {

    public static boolean palindromeString(char[] s, int i, int j){

        if (i>j){
            return true;
        }
        if (s[i]!=s[j]){
            return false;
        }else {
            return palindromeString(s, i + 1, j - 1);
        }
    }

    public static void main(String[] args) {
        String s = "abccba";
        char[] ch = s.toCharArray();
        boolean b = palindromeString(ch,0,ch.length-1);
        if (b){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
