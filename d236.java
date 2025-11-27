import java.util.Arrays;

public class d236 {
    public static void main(String[] args) {
        int arr[]={4,1,1,1,2,3,5};
        int k=5;
        int res[]=longestSubofK(arr,k);
        for (int i = res[0]; i <=res[1] ; i++) {
            System.out.println(arr[i]);
        }
//        System.out.println(Arrays.toString(res));
    }
    public static int[] longestSubofK(int []arr,int k){
        int sum=0,start=0,maxLen=0;
        int resSt=0,resEnd=0;
        for (int end = 0; end < arr.length; end++) {
            sum+=arr[end];

            while (sum>=k){
               if(sum==k){
                   if((end-start+1)>maxLen){
                       maxLen=(end-start+1);
                       resSt=start;
                       resEnd=end;
                   }
               }
               sum=sum-arr[start++];
            }
        }
        return new int[]{resSt,resEnd};
    }
}
