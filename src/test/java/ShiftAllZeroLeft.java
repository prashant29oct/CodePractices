public class ShiftAllZeroLeft {

    public static void shiftZeroToLeft(int[] a){
        int i=0; int j=a.length-1;

        while (i<j){

            if (a[i]!=0 && a[j]==0){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
                j--;
            }
            if (a[i]==0){
                i++;
            }
            if (a[j]!=0){
                j--;
            }
        }

        for (int c:a){
            System.out.print(c);
        }
    }

    public static void shiftAllZeroLeft2(int[] a)
    {
        int index=0;
        int[] newArray = new int[a.length];
        for (int i=0; i<a.length; i++){
            if (a[i]==0){
                newArray[index] = a[i];
                index++;
            }
        }
        for (int i=0; i<a.length; i++){
            if (a[i]!=0){
                newArray[index] = a[i];
                index++;
            }
        }
        for (int n:newArray){
            System.out.print("  "+n);
        }
    }

    public static void main(String[] args) {

        int[] a = {2,3,0,6,0,8,0};
        shiftZeroToLeft(a);
        shiftAllZeroLeft2(a);

    }
}
