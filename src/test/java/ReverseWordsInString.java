public class ReverseWordsInString {

    public static void reverseWords(String s) {

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                rev = rev + s.charAt(i);
            } else if (!Character.isLetterOrDigit(s.charAt(i))) {
                rev = rev + s.charAt(i);
            }
        }
        System.out.println(rev);

    }

    public static void main(String[] args) {

        String s = "Pra@sh*a%nt";
        reverseWords(s);
    }
}
