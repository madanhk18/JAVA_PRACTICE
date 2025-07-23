import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class demo11 {
    public static int  MissingElement(int []arr) {
        Arrays.sort(arr);
        int index = 0; //0 1 3
        for (int i = 0; i < arr.length; i++) {
            if (index == arr[i]) {

            } else {
                return i;
            }
            index++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        System.out.println( MissingElement(arr));
    }
}
