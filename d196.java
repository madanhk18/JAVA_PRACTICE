import java.util.Arrays;

public class d196 {
    public static void main(String[] args) {
        int arr[]={1,3,2,1};
        fun(arr);
    }
    public static void fun(int []arr){
        int resArr[]=new int[arr.length];
        Arrays.fill(resArr,1);
//
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
                resArr[i]+=1;
        }
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]>arr[i+1])
                resArr[i]+=1;
        }
        int sum=0;
        for(int v:resArr){
            sum+=v;
        }
        System.out.println(sum);
    }
}
