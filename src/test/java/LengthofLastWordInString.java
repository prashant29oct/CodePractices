public class LengthofLastWordInString {

    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        String s2 = s1[s1.length-1];
        return s2.length();
    }

    public static void main(String[] args) {

        String s = "Hello World";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
    }
}
