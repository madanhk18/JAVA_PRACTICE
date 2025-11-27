public class demo54 {
    public static void  subArraySum(int[] arr,int target){
        int sum=0;
        int index[]=new int[2];int ind=0;

        for (int i = 0; i < arr.length; i++) {
            sum=arr[i];
            for (int j = i; j <arr.length ; j++) {
                sum+=arr[j];
                if(sum==target){
                    index[ind++]=i;
                    index[ind]=j;
                }
            }
        }
        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 7, 5};
        int target=12;
        subArraySum(arr,target);
    }
}
