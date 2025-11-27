public class d242 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,2,2};
        findPeak(arr);
    }
    public static void findPeak(int []arr){
        int low=0,high=arr.length-1;

        while (low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                high=mid;
            }
            else{
                high--;
            }
        }
        System.out.println(arr[low]);
    }
}
