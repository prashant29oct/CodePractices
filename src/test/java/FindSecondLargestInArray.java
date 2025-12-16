import java.util.Arrays;

public class FindSecondLargestInArray {

    public static void main(String[] args) {

        //int[] a= {2,3,5,1,6,8,12};
        int[] a = {5,7,2,9,1};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++){

            if (first<a[i]){
                second=first;
                first=a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }
        System.out.println(second);
    }
}
