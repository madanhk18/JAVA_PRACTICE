public class demo71 {
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        int pre=1;
        int suf=1;
        int maximu=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;

            pre*=arr[i];
            suf*=arr[arr.length-i-1];
            maximu=Math.max(maximu,Math.max(pre,suf));
        }
        System.out.println(maximu);
    }
}
