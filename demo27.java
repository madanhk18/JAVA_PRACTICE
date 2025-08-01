public class demo27 {
    public static void IndexforTarget(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int answer=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]>=target){
                answer=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
       int arr[]={3,7,10,12};
       int target=7;
       IndexforTarget(arr,target);
    }
}
