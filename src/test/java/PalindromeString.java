public class PalindromeString {

    public static void main(String[] args) {

        String s = "noonn";
        String rev = "";

        for (int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        if (rev.contains(s)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
