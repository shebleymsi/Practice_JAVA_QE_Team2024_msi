package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.number_system_conversion;

public class NumberConversionDemo {
    public static void main(String[] args) {
        
        // Decimal to binary - user input 
        /*
        Scanner input = new Scanner(System.in);
        int decimal ;
        System.out.print("Enter any Decimal Number : ");
        decimal = input.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary = "+binary);
        */
        
        // Decimal to Ocatal
        /*
        int decimal = 15;
        String octal = Integer.toOctalString(decimal);
        System.out.println("Ocatal = "+octal);
        */
        
        //Decimal to Hexadecimal 
        
        int decimal = 256;
        String hexa = Integer.toHexString(decimal);
        System.out.println("Hexadecimal = "+hexa);
                               
    }
    
}
