import java.util.Arrays;

public class d181 {
    public static void main(String[] args) {
        String time = "12:01:00AM";
        convertInto24(time);
    }

    public static void convertInto24(String s) {
        String peroid = s.substring(s.length() - 2);
        String arr[] = s.substring(0, s.length() - 2).split(":");
//        System.out.println(String.join(":",arr));

        int hour=Integer.parseInt(arr[0]);
        if(peroid.equals("AM")){
            if(hour==12){
                arr[0]="00";
            }
        }else {
            if(hour!=12){
                hour+=12;
                arr[0]=String.valueOf(hour);
            }
        }
        System.out.println(String.join(":",arr));
    }
}