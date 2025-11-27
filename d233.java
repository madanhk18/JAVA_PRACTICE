import java.util.*;

public class d233 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double distance=0.0;
        String inputSpeed=sc.nextLine();
        String inputTime=sc.nextLine();

        // m/s
        //km/hr -> m/s
        double speed=Double.parseDouble(inputSpeed.replaceAll("[^0-9]","").trim());
        double time=Double.parseDouble(inputTime.replaceAll("[^0-9]",""));

        String valueSpeed=inputSpeed.replaceAll("[^a-zA-Z]","");
        String valueTime=inputTime.replaceAll("[^a-zA-Z]","");

        double finalSpeed=0.0;
        double finalTime=0.0;


        if(valueSpeed.equals("kmhr"))
           finalSpeed=speed*(5.0/18.0);
        else
            finalSpeed=speed;

        if(valueTime.equals("hr"))
            finalTime=time*3600.0;
        else
            finalTime=time;

        distance=finalSpeed*finalTime;
        System.out.printf("%.2f m",distance);

    }
}
