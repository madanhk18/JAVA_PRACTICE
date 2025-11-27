import java.util.Arrays;
import java.util.stream.Stream;

public class d151 {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,2,5,12,22};

//       int c=(int) Arrays.stream(arr)
//                .filter(n -> n%2==0)
//                .count();



//        System.out.println(c);

      int newArray[]=Arrays.stream(arr)
              .distinct()
              .sorted()
              .filter(n-> n%2==0)
              .map(z -> z*2)
              .toArray();
      Arrays.stream(newArray).forEach(n-> System.out.println(n));
    }
}
