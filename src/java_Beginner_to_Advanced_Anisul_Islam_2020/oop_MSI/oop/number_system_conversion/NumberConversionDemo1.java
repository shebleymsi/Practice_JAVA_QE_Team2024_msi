package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.number_system_conversion;

public class NumberConversionDemo1 {
    public static void main(String[] args) {
        
        //Binary to Decimal 
        /*
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal : "+decimal); 
        // Here, Integer is wrapper class
        //10
        */ 
        
        // Octal to Decimal 
        /*
        String octal = "675";
        Integer decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal : "+decimal);
        //445
        */
        
        // Hexadecimal to Decimal
        String hexadesimal = "F";
        Integer decimal = Integer.parseInt(hexadesimal, 16);
        System.out.println("Decimal : "+decimal);
    }
    
}
