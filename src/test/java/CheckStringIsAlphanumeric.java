public class CheckStringIsAlphanumeric {

    public static boolean checkStringAlphanumeric(String str){

        if (str.length()==0){
            return false;
        }
        for (char c:str.toCharArray()){
            if (!Character.isLetterOrDigit(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "dfshfk65j@#654ljkl";
        System.out.println(checkStringAlphanumeric(s));
    }
}
