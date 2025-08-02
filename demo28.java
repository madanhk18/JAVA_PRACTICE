public class demo28 {
    public static void findFloor(int [] arr,int target){
        int low=0;
        int high=arr.length-1;int Ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                Ans=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(Ans+ "   ");
    }
    public static void ceil(int[] arr,int target){
        int low=0;
        int high=arr.length-1;int AnsCeil=-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                AnsCeil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;

            }
        }
        System.out.println(AnsCeil);
    }
    public static void main(String[] args) {
        int arr[]={3,7,10,12};
        int target=9;
        findFloor(arr,target);
        ceil(arr,target);
    }
}
