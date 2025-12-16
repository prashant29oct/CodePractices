public class MadeInPlaceForOddEvenNumbersInArray {

    public static void rearrange(int[] arr) {
        int evenIndex=0;
        int oddIndex=1;

        while(evenIndex< arr.length && oddIndex<arr.length){

            if(arr[evenIndex]%2==0){
                evenIndex+=2;
                continue;
            }
            if (arr[oddIndex]%2!=0){
                oddIndex+=2;
                continue;
            }
            if (evenIndex<arr.length && oddIndex<arr.length){
                int temp = arr[evenIndex];
                arr[evenIndex]=arr[oddIndex];
                arr[oddIndex]=temp;
                evenIndex+=2;
                oddIndex+=2;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 6, 5, 4, 7, 8, 10, 9};
        rearrange(a);
        for (int num:a){
            System.out.print(num+" ");
        }
    }
}
