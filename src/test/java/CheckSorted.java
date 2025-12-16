public class CheckSorted {

    public static boolean checkSortedArray(int[] a){

        for(int i=1; i<a.length; i++){

            if (a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,1,5};
        System.out.println(checkSortedArray(a));
    }
}
