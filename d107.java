import java.util.Arrays;

public class d107 {
    public static void main(String[] args) {
        int arr[]={7, 1, 0, 3, 12, 0 ,11, 0 , 0 , 45, 89, 4};
        MoveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void MoveZerosToEnd(int []arr){
        int i=0;
        for (int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        for (int j = i; j <arr.length ; j++) {
            arr[j]=0;
        }
    }
}
