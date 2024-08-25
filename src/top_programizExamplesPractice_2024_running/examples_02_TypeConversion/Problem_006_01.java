package top_programizExamplesPractice_2024_running.examples_02_TypeConversion;


public class Problem_006_01 {
    //Example 2: Convert boolean to String using toString()
    public static void main(String[] args) {

        // create boolean variables
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;

        // convert boolean to string
        // using toString()
        String stringValue1 = Boolean.toString(booleanValue1);
        String stringValue2 = Boolean.toString(booleanValue2);


        System.out.println(stringValue1);    // true
        System.out.println(stringValue2);    // true
    }


}
