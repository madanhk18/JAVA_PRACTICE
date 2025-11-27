import java.util.Arrays;

public class d201 {
    public static void main(String[] args) {
        String name="Brother";
        revString(name);
    }
    public static void revString(String s){
        char arr[]=s.toCharArray();
        int l=0,r=arr.length-1;
        while (l<r){
            char t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;

            l++;r--;
        }
        String v=new String(arr);
        System.out.println(v);
//        System.out.println(String.join(" ",arr));
    }
}
