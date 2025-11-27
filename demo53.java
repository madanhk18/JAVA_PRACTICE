public class demo53 {
    public static void   swap(int[]arr,int low,int high){
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;high--;
        }
    }
    public static void reverseArray(int[] arr,int target){
        int n=arr.length;
       swap(arr,0,n-1);
        swap(arr,0,target-1);
        swap(arr,target,n-1);
        for(int val:arr){
            System.out.print(val+" ");
        }


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; //5 4 3 2 1
        // 5 1 2 3 4
        //4 5 1 2 3
        int target=2;
        reverseArray(arr,target);
    }
}
