import java.util.Arrays;

public class demo78 {
    public static void timeFinding(int piles[],int h){
       int maxEle=piles[0];
       int pos=0;
       for (int i = 1; i < piles.length; i++) {
            if(piles[i]>maxEle)
                maxEle=piles[i];
        }
       int high=maxEle;int low=1;
       while (low<=high){
           int mid=(low+high)/2;
           int ans=totalHours(piles,mid);
           if(ans<=h){
               pos=mid;
               high=mid-1;
           }
           else {
               low=mid+1;
           }
       }
        System.out.println(pos);
    }
    public static int totalHours(int arr[],int mid){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int val=(arr[i]+mid-1)/mid;
            sum+=val;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={3,6,7,11};
        int h=8;
        timeFinding(arr,h);
    }
}
