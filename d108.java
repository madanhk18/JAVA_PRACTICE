import java.util.Arrays;

public class d108 {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 2, 2, 3, 4, 4, 5};
        int res=returnUniqueNumbers(arr);
        System.out.println("Number of unique elements = "+ res);
        while (res<arr.length){
            arr[res++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int returnUniqueNumbers(int []arr){
        int i=0;
        for (int j = 1; j <arr.length ; j++) {
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
//        while (i< arr.length){
//            arr[i]=0;
//            i++;
//        }
        return i+1;
    }
}
