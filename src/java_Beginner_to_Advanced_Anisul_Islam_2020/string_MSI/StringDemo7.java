package java_Beginner_to_Advanced_Anisul_Islam_2020.string_MSI;

public class StringDemo7 {

    public static void main(String[] args) {

        /*// String passing in StringBuffer
        String s1 = "Shahadul";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);*/
        //Stringbuffer declear, creat , print
        StringBuffer sb = new StringBuffer("Shahadul");
        System.out.println(sb);

        //append()=  add any Data type value with main string
        sb.append(" Islam ");
        sb.append(35);
        
        System.out.println(sb);

        //reverse = reverse string all character 
        sb.reverse();
        System.out.println(sb);

        //delet(0,0) = index 0 to index 5 delet from string
        sb.delete(0, 5);
        System.out.println(sb);

        //setLength = put 5, so 1 to 5 return strinh character with space
        sb.setLength(5);
        System.out.println(sb);

    }
}
