package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.inheriting_private_member;

public class Test {

    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.setName("Shahadul");
        t1.setAge(35);
        t1.setQualification("MSc in Math");
        t1.displayInformation();
        
        /* System.out.println("Name : "+t1.getName());
        System.out.println("Age : "+t1.getAge());
        System.out.println("Qualification : "+t1.getQualification());
        */
                
        Teacher t2 = new Teacher();
        t2.setName("MSI");
        t2.setAge(30);
        t2.setQualification("Mathematics");
        t2.displayInformation();
      
        
       
        
    }

}
