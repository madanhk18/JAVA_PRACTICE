public class demo68 {
    public static void subArraySum(int[] arr){
        int sum=0;
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            res=Math.max(res,sum);
            if(sum<0)
                sum=0;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        subArraySum(arr);
    }
}
