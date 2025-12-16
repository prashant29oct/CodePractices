import java.util.Arrays;

public class FindTwoSum {

    public static void findTwoSum(int[] a, int target){

        Arrays.sort(a);

        int i=0; int j=a.length-1;
        while (i<j){
            if (a[i]+a[j]==target){
                System.out.println("Index are :" +i+ " , " +j);
                System.out.println("Values are : " +a[i]+ " , "+a[j]);
                i++;
                j--;
            }
            else if (a[i]+a[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        }

    public static void main(String[] args) {

        int[] a = {2,4,6,1,2,3};
        int target = 9;
        findTwoSum(a,target);
    }
    }
