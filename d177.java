import java.util.Arrays;

public class d177 {
    public static void main(String[] args) {
        int arr[]={2,10,12,1,11};
        NGE2(arr);
    }
    public static void NGE2(int []arr){
        int res[]=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <(i+arr.length-1) ; j++) {
                int index=j%arr.length;
                if(arr[index]>arr[i]){
                    res[i]=arr[index];
                    break;
                }
            }
            if(res[i]==0) res[i]=-1;
        }
        System.out.println(Arrays.toString(res));
    }
}
