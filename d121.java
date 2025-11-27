import java.util.Arrays;

public class d121 {
    public static void main(String[] args) {
        String num1 = "00123";
        String num2 = "32100";
        int arr[]=new int[num1.length() +num2.length()];

        int m=num1.length();
        int n=num2.length();

        for (int i = m-1; i >=0 ; i--) {
            for (int j=n-1;j>=0;j--){
                int product=(num1.charAt(i)-'0') + (num2.charAt(j)-'0');

                product+= arr[i+j+1];

                arr[i+j+1]=product%10;
                arr[i+j] += product/10;
            }
        }
        StringBuilder ssb=new StringBuilder();
        for (int nums:arr){
            if(nums==0 && ssb.length()==0)
                continue;

            ssb.append(nums);
        }
        System.out.println(ssb.toString());

    }
}
