import java.time.LocalDate;
import java.util.Scanner;

public class d182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int c=1;
//        while (sc.hasNextLine()) {
//            String s = sc.nextLine();
//            System.out.println(c+" "+s);
//            c++;
//        }
        int date=8;
        int month=5;
        int year=2015;


        ;
        LocalDate d=LocalDate.parse(String.valueOf(year)+"-"+String.format("%02d",month)+"-"+String.format("%02d",date));
        d.getDayOfWeek();
    }
}
