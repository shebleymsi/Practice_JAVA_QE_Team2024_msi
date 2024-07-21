package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.inheriting_private_member;

public class Teacher extends Person {

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

   
    void displayInformation(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Qualification : "+getQualification());
        System.out.println("\n\n");
    }
}
