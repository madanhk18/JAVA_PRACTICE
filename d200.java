import java.util.Arrays;
import java.util.Comparator;

public class d200 {
    public static void main(String[] args) {
        int arr[]={2,45,15,5,9,2,1,8,12,4,7};

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(n-> System.out.print(n+" "));
    }
}
