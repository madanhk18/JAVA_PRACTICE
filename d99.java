import java.util.Arrays;

public class d99 {
    public static void main(String[] args) {
        int arr[]={3,3};
        int target=6;

        Arrays.sort(arr);
        //1,2,6,7,8,11,15

      for (int i=0;i<arr.length;i++){
       int remain=target-arr[i];
          for (int j = i; j <arr.length ;) {
              if(arr[j]==remain){
                  System.out.println(i +" "+ j);
                  break;
              }else
                  j++;
          }
      }
    }
}
