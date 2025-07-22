import java.util.Arrays;

public class demo9 {
    public static void seondLargest(int []arr){
      int lasrgest=arr[0];
      int secLarge=-1;                          //               l
        for (int i = 1; i < arr.length ; i++) { //3, 5 ,2, 7 ,8, 9, 4, 1
            if(arr[i]>lasrgest){                //            s
                secLarge=lasrgest;
                lasrgest=arr[i];
            }
            if(arr[i]>secLarge && arr[i]<lasrgest){
                secLarge=arr[i];
            }
        }
        System.out.println(secLarge);
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,7,8,9,4,1};
        seondLargest(arr);
    }
}
