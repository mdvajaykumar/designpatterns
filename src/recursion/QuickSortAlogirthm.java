package recursion;


import java.util.Arrays;

public class QuickSortAlogirthm {

    public static void main(String[] args) {
        int  [] A = {1,6,4,3,8,2,4};
        quickSort(0,A.length-1, A);
        System.out.println(Arrays.toString(A));
    }

    private static void quickSort(int low, int high, int[] a) {
        if(low>high){
            return;
        }
        int partitionIndex =findPivot(low, high, a);

        quickSort(low,partitionIndex-1,a);

        quickSort(partitionIndex+1, high,a);

    }

    private static int findPivot(int low, int high, int[] a) {
        int pivot  = a[low];
        int k = low;
        int l = high;

        while(k<l){

            while(pivot>=a[k] && k<high){
                k++;
            }

            while(pivot <a[l] && l>low){
                l--;
            }
            if(k<l){
                swap(k,l, a);
            }

        }
        swap(low, l,a);
        return l;

    }

    private static void swap(int k, int l, int[] a) {
        int temp = a[k];
        a[k] =a[l];
        a[l]=temp;
    }
}
