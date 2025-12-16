public class BubbleSort {

    public static void bubbleSort(int[] a){

        for (int i=0; i<a.length; i++){
            boolean swapped = false;
            for (int j=0; j<a.length-i-1; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped = true;
                }
            }
            if (swapped=false){
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {10,9,5,6,15,7};
        bubbleSort(a);
        for (int i:a){
            System.out.print(" "+i);
        }
    }
}
