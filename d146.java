public class d146 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,1,2,3,3};
        duplicate2(arr);
    }
    public static void duplicate2(int []arr){
        int fast=2,slow=2;
        int n=arr.length;
        if(n<3) System.out.println(n);

        while(fast<n){
            if(arr[fast]!=arr[slow-2]){
                arr[slow++]=arr[fast];
            }
            fast++;
        }
    }

}
