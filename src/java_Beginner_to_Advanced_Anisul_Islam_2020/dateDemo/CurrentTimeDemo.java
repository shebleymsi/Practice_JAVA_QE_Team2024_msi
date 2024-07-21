
package java_Beginner_to_Advanced_Anisul_Islam_2020.dateDemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeDemo {
    public static void main(String[] args) {
       LocalTime time =  LocalTime.now(); // System.out.println(time);
       DateTimeFormatter formater = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedtime = time.format(formater);
        System.out.println("Current Time : "+formattedtime);
    }
    
}
