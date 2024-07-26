package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.final_keyword_1;

public class University {
    
    final String UNIVERSITY_NAME = "JAGANNATH UNIVERSITY";
    final int Fees = 700;
    
  //    blank final variable
    
  /*    final int fees;
        
        University (){    //Costructor
        fees = 700;
        }
  */
    
  //    static blank final variable
    
  /*    static final int fees = 700;
    
        static{        //static block
        fees = 700;
        }
  */
 
    void display(){
        System.out.println(UNIVERSITY_NAME);
        System.out.println(Fees);
    }

}
