public class MoveAllZeroLeft {

    public static void main(String[] args) {

        int[] a = {0,1,0,3,12};
        //int[] b = new int[a.length];
        int index=0;
        for (int num:a){
            if (num==0){
                a[index]=num;
                index++;
            }
        }
        for (int i=index; i<a.length;i++){
            if (a[i]!=0){
                a[index] = a[i];
                index++;
            }
        }

        for (int n:a){
            System.out.println(n);
        }
    }
}
