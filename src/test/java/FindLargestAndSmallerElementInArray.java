import java.util.ArrayList;

public class FindLargestAndSmallerElementInArray {

    public static void findLargestAndSmallerElementInArray(int[] a){

        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i=0; i<a.length; i++){

            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum value in Array "+ min);

        for (int i=0; i<a.length; i++){

            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum value in Array "+ max);
    }

    public static void main(String[] args) {

        int[] a = {2,3,5,7,1};
        findLargestAndSmallerElementInArray(a);
    }
}
