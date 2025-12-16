public class MoveZeroToEnd {

    public static void main(String[] args) {

        int[] a = {1,0,3,0,4,5,0,7,8,9};

        int i=0;

        for(int x:a){
            if (x!=0){
                a[i] = x;
                i++;
            }
        }
        while (i<a.length){
            a[i]=0;
            i++;
        }

        for (int n:a){
            System.out.print(n);
        }
    }
}
