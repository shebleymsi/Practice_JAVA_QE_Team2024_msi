package java_Beginner_to_Advanced_Anisul_Islam_2020.dateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateformat = new SimpleDateFormat("MM/dd/YYYY");
        String currentdate = dateformat.format(date);
        System.out.println("Current Date  : " + currentdate);

    }

}
