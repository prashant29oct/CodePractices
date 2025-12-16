public class SumArrayElementUsingRecursion {

    public static int sumOfArrayElement(int[] a, int index){
        if (index==a.length){
            return 0;
        }
        int sum = a[index]+sumOfArrayElement(a,index+1);
        return sum;
    }

    public static void main(String[] args) {

        int[] a = {3,2,5,1,6};
        System.out.println(sumOfArrayElement(a,0));
    }
}
