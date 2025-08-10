public class demo40 {
    public static void CallingRotatio(int[] arr,int k){
        if(k==0){
            for (int p = 0; p< arr.length; p++) {
                System.out.print(arr[p]+" ");
            }
            return;
        }
        int n=arr.length;
        int temp=arr[n-1];
        for (int i = n-1; i >0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        k--;
        CallingRotatio(arr,k);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7}; //7 1 2 3 4 5 6
        int k=3;                    //6 7 1 2 3 4 5
        CallingRotatio(arr,k);       // 5 6 7 1 2 3 4
    }
}
