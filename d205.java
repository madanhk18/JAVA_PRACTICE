import java.util.Arrays;

public class d205 {
    public static void main(String[] args) {
        /*1. Arrays

a) Merge two sorted arrays
Problem Statement:

Given two sorted arrays arr1 and arr2, merge them into a single sorted array without using any built-in sort function.

Variation:

Merge k sorted arrays.

Merge in-place if one array has extra space.

         */
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6,8};
        merge2SortedArr(arr1,arr2);
    }
    public static void merge2SortedArr(int []arr1,int[] arr2){
        int res[]=new int[arr1.length+arr2.length];
        int i=0, j=0,k=0;
        int m=arr1.length;
        int n=arr2.length;
        while (i<m && j<n){
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }
            else {
                res[k++]=arr2[j++];
            }
        }
        while (i<m){
            res[k++]=arr1[i++];
        }
        while (j<n){
            res[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(res));
    }
}
