public class demo36 {
    public static void funcCall(int[] arr){
        int count=0;
        int leng=0;
        for(int nums:arr){
          leng=String.valueOf(nums).length();
          if(leng%2==0)
              count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int []arr={12,345,2,6,7896};
        funcCall(arr);
    }
}
