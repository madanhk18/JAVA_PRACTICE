public class demo42 {
    public static void RotationArray(int[] arr,int k){
        int n=arr.length;

        //base condition
        if(k==0){
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j]+ " ");
            }
            return;
        }

        int temp=arr[n-1];
        for (int i = n-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        RotationArray(arr,k=k-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k=3;//7 1 2 3 4 5 6
        RotationArray(arr,k);         //6 7 1 2 3 4 5
    }                               //5 6 7 1 2 3 4
}
