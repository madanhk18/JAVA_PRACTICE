public class demo80 {
    public static void main(String[] args) {
        int arr[]={3,1,5,10,1};
        int sum=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            sum+=arr[i];
            arr[i]=sum;
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
