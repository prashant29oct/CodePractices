import java.util.Arrays;

public class MoveAllZeroRight {

    public static void main(String[] args) {

        int[] a = {0, 1, 0, 3, 12};
        int index=0;

        for (int num:a){
            if (num!=0){
                a[index]=num;
                index++;
            }
        }
        for (int i=index; i<a.length; i++){
                a[i]=0;
        }
        System.out.println(Arrays.toString(a));
    }
}
