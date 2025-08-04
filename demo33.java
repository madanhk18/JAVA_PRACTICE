public class demo33 {
    public static void countDuplicatrs(int[] arr,int x){
        int count=0;
        int low=0;int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==x){
                count++;
                high=mid-1;
            } else if (arr[mid]<x) {
                low=mid+1;
            }else
                high=mid-1;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,6,9,11,11,11,14,20};
        int x=11;
        countDuplicatrs(arr,x);
    }
}
