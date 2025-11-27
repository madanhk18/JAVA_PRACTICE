import java.util.Arrays;

public class d229 {
    public static void main(String[] args) {
        int arr[]={5, 2, 8, 7, 3, 9, 1};
        int res[]=giveIncreaseDecrease(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] giveIncreaseDecrease(int []arr){
        Arrays.sort(arr);
        int res[]=new int[arr.length];
        int st=0,end=arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if(i<(arr.length)/2)
                res[i]=arr[st++];
            else
                res[i]=arr[end--];
        }
        return res;
    }
}
