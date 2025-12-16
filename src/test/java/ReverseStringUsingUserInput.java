import java.util.Scanner;

public class ReverseStringUsingUserInput {

    public static void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        char[] ch = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j){
            char temp = ch[i];
            ch[i]= ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String sb = new String(ch);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        reverseString();
    }
}
