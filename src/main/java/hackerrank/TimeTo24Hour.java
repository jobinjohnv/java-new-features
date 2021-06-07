package hackerrank;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

public class TimeTo24Hour {
    public static void main(String[] args) {
        String time12 = "12:01:00AM";
        String time24 =null;

        if(time12.endsWith("PM") && !(time12.startsWith("12"))){
           String[] timeSplit = time12.split(":");
            int hour12 = Integer.parseInt(timeSplit[0]);
            int hour24 = hour12 + 12;
            time24= String.valueOf(hour24) +":"+ timeSplit[1] +":"+ timeSplit[2];
            time24 =time24.replace("PM","");
        }else if (time12.endsWith("AM") && !(time12.startsWith("12") )){
            time24 =time12.replace("AM","");
        }
        else if (time12.startsWith("12")){
            if (time12.endsWith("AM")){
                String[] timeSplit = time12.split(":");
                time24= "00:"+ timeSplit[1] +":"+ timeSplit[2];
                time24 =time24.replace("AM","");
            }else if (time12.endsWith("PM")){
                time24 =time12.replace("PM","");
            }
        }
        System.out.println("Formatted Time is : "+time24);
    }

}
