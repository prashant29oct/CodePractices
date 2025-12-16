public class SortingArray {

    public static void main(String[] args) {

        int [] a = {2,7,8,1,3,4,5};
        int i=0;
        while (i<a.length-1){

            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;

                if (i>0) i--;
                
            }else {
                i++;
            }
        }

        for (int n:a){
            System.out.println(n);
        }
    }
}
