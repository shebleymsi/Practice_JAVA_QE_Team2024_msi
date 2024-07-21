
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.oop_1;

public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x = 10;
        System.out.println("x Before Call : "+x);
        
        ob.change(x); //Actual parameter
        System.out.println("x After call : "+x);
    }
    
}
