

package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.list_3;

import java.util.HashMap;


public class HashMapDemo {
    
    public static void main(String[] args) {
        
        // hashMap =  Key_value, put_get.
        HashMap<Integer,String> customer = new HashMap<Integer,String>();
        
        customer.put(101,"Shebley");
        customer.put(102,"Sanjoy");
        customer.put(103,"Sonia");
        
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
        
        
        
    }
    
}
