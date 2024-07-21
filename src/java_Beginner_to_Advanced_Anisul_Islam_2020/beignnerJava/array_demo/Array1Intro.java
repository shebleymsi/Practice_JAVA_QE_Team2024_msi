
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.array_demo;


public class Array1Intro {
    public static void main(String[] args) {
                
        int[] number = new int[5];
       
        number[0]=6;
        number[1]=7;
        number[2]=8;
        number[3]=9;
        number[4]=10;
        
        System.out.println("Array line 4 storage value = "+number[3]); // 9
        
        int len = number.length;
        System.out.println("Array Size = "+len); //5
        
        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Sum = "+sum); // 40
        
        int sum1 = number[4] + number[3];
        System.out.println("Sum of line5 + line4 = "+sum1); // 19
        
        int sub = number[4] - number[3];
        System.out.println("Substraction of line5 - line4 = "+sub); // 1
        
        int multiplication = number[0]*number[1]*number[2]*number[3]*number[4];
        System.out.println("Multiplications of all line = "+multiplication); // 30240
                       
        int multiplication1 = number[4] * number[3];
        System.out.println("Multiplications of line5 * line4 = "+multiplication1); // 90
               
    }
        
}
