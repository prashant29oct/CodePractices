public class BubbleSortUsingRecurssion {

    public static void bubbleSort(int[] a, int size){

        if (size==0||size==1){
            return;
        }
        for (int i=0; i<a.length-1; i++){
            if (a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        bubbleSort(a,size-1);
    }

    public static void main(String[] args) {

        int[] a = {4,6,7,1,2,3,5};
        bubbleSort(a,7);
        for (int i:a){
            System.out.print(" "+i);
        }
    }
}
