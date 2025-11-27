import java.util.Arrays;

public class d202 {
    public static void main(String[] args) {
        String sen="Gud ,  morningg   :guyz ?  madan";
        sen=sen.replaceAll("[^a-zA-Z0-9]"," ");
        String arr[]=sen.split("\\s+ ");

        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=new StringBuilder(arr[i]).reverse().toString();
            if (i % 2 == 0) {
                arr[i] = reverseAllWords(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static String reverseAllWords(String word){
        char arr[]=word.toCharArray();
        int l=0,r=arr.length-1;
        while (l<r){
            char t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;

            l++;r--;
        }
        return new String(arr);
//
    }
}
