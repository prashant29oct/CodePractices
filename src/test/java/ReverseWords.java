public class ReverseWords {

    public static void main(String[] args) {

        String s = "I Love Automation";
        String[] c = s.split(" ");

        String rev= "";

        for (int i=c.length-1; i>=0; i--){
            rev = rev+c[i]+" ";
        }

        System.out.println(rev);
    }
}
