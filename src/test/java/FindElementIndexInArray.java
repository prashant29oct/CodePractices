public class FindElementIndexInArray {

    public static void elementIndex(int[] a, int element){

        for (int i=0; i<a.length; i++){
            if (element==a[i]){
                System.out.println("Index is :" + i);
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {1,3,3,4,5,6,6,7,8,9,9};
        int element = 6;
        elementIndex(a,element);
    }
}
