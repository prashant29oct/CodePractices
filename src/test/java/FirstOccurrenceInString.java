public class FirstOccurrenceInString {

    public static int strStr(String haystack, String needle) {

        //return haystack.indexOf(needle);
        int m = haystack.length();
        int n = needle.length();
        for(int i=0; i<m-n+1; i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

       String haystack = "butsad";
       String needle = "sad";
       System.out.println(strStr(haystack,needle));
        //System.out.println(haystack.length());
        //System.out.println(needle.length());
    }
}
