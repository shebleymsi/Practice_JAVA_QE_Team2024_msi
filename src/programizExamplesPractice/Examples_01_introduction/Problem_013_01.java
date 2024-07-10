package programizExamplesPractice.Examples_01_introduction;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Problem_013_01 {
    //Example 2: Round a Number using DecimalFormat
    public static void main(String[] args) {
        double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));

    }
}
