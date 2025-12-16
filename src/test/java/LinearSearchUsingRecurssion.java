public class LinearSearchUsingRecurssion {

    public static boolean linearSearch(int[] a, int index, int key){
        if (index==a.length){
            return false;
        }
        if (a[index]==key){
            return true;
        }
        else {
            boolean remainingPart = linearSearch(a,index+1,key);
            return remainingPart;
        }
    }

    public static void main(String[] args) {

        int[] a = {2,5,7,8,4};
        int key = 1;
        boolean result = linearSearch(a,0,key);
        if (result){
            System.out.println("Key found");
        }else {
            System.out.println("key not found");
        }
    }
}
