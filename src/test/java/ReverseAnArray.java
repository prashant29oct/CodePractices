public class ReverseAnArray {

    public static void reverseArray(int[] a){

        int i = 0; int j = a.length-1;
        while (i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for(int n:a){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,5,7,1};
        reverseArray(a);
    }
}
