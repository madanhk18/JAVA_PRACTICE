import java.util.Arrays;

public class d212 {
    public static void main(String[] args) {
        String s = "Hello  World";
        String arr[] = s.split("\\s+");
        int ind = -1;
        long weight = 0;
        for (int i = 0; i < arr.length; i++) {
            long ans = functionCall(arr[i]);
            if (ans > weight) {
                weight = ans;
                ind = i;
//        System.out.println(Arrays.toString(arr));
                System.out.println(arr[ind]);
            }
        }
    }



    public static long functionCall(String s){
        long sum=0;
        for (int i = 0; i <s.length() ; i++) {
            long asciVal=s.charAt(i);
            sum+=asciVal;
        }
        return sum;
    }
}
