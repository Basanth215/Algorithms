package com.solutions;
/*
    Find maximum Xth element that repeats X times in given array.
    Example:{3 ,2,2,1,4,1,5} here, 2 repeats 2 times so answer is 2.
    Example:{3 ,2,2,1,3,3,4,1,5} here, 2 repeats 2 times and 3 repeats 3 times but 3 is max so answer is 3.
 */
public class MaxEquallyRepeatNumber {
    public static void main(String...args){
        MaxEquallyRepeatNumber c = new MaxEquallyRepeatNumber();
        int[] a = {3 ,2,2,1,4,1,5};
        System.out.println(c.solution(a));
    }

    private int solution(int[] A) {
        //Merge sort
        sort(A, 0, A.length-1);
        int result=0;
        for(int i=0;i<A.length;i++){
            int s = i+(A[i]-1);
            if(A[i]==1 && i+1<A.length && A[i+1]!=1 && i-1>=0 && A[i-1]!=1){
                result = 1;
            }
            if(s>=A.length) {
                break;
            }else if(A[i]!=1 && A[i]==A[s]){
                result = A[i];
                i = s;
            }
        }
        return result;
    }

    void merge(int[] arr, int l, int m, int r)
    {
        // Find sizes of two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        if (n1 >= 0) System.arraycopy(arr, l, L, 0, n1);
        if (n2 >= 0) System.arraycopy(arr, m+1, R, 0, n2);

        /* Merge the temp arrays */

        // Initial indexes of first and second sub-arrays
        int i = 0, j = 0;

        // Initial index of merged sub-array array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int[] arr, int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
