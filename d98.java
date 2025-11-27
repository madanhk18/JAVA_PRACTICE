public class d98 {
    public static void main(String[] args) {
        int arr[]={11,2,7,15};
        int target=6;
        int sum=0;
        int l=0,r=arr.length-1;
        while (l<=r){
            sum=arr[l]+arr[r];
            if(sum==target)
            {
                System.out.println(l+" "+ r);
                break;
            } else if (sum<target) {
                l++;
            }else
                r--;
        }
    }
}
