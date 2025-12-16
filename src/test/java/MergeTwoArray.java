public class MergeTwoArray {

    public static void main(String[] args) {

        int[] a={1,3,5,8};
        int[] b={2,4,6,7};

        int[] merge = new int[a.length+b.length];
        int i=0; int j=0; int k=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                merge[k] = a[i];
                i++;
                k++;
            }else {
                merge[k]=b[j];
                j++;
                k++;
            }
        }
            if (merge[merge.length-2]==a[a.length-1]){
                merge[merge.length-1]=b[b.length-1];
            }else {
                merge[merge.length-1]=a[a.length-1];
            }

        for (int n:merge){
            System.out.println(n);
        }
    }
}
