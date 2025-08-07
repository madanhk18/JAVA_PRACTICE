public class demo39 {
    public static void main(String[] args) {
        int arr[] = {1,5,7,12,6,9};
        int n= arr.length;;
        int temp=arr[n-1];
        for (int i = n-1; i >0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
