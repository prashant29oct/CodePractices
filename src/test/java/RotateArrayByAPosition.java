import java.util.Arrays;

public class RotateArrayByAPosition {

    public static void reverseArray(int[] a, int s, int e){

        while (s<e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }

    public static int findIndex(int[] a, int target){
        int index = 0;
        for (int i=0; i<a.length; i++){
            if (a[i]==target){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void rotateArray(int[] a, int k){

        int n=a.length;
        //int point = findIndex(a,k);
        reverseArray(a,0,a.length-1);
        int point = findIndex(a,k);
        reverseArray(a,0,point);
        reverseArray(a,point+1,a.length-1);

    }
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,7};
        int k = 5;
        rotateArray(a,k);
        System.out.println(Arrays.toString(a));

    }
}
