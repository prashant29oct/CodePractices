public class MoveAllZeroToEnd {

    public static void main(String[] args) {

        int[] a = {0,0,3,4,0,7,0,1,2,3};
        int index=0;

        for (int i:a){
            if(i!=0){
                a[index]=i;
                index++;
            }
        }
        for (int i=index; i<a.length; i++){
            a[i]=0;
        }

        for (int b:a){
            System.out.print(b);
        }
    }
}
