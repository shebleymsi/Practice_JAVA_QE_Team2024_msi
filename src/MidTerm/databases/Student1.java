package MidTerm.databases;

public class Student1 implements java.io.Serializable {

    /*
     * Student class have 4 variables which will be constructed as Student Object into List<Student>.
     */
    public String firstName;
    public String lastName;
    public String score;
    public String id;

    public Student1(String s){}

    public Student1(String firstName, String lastName, String score, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
        this.id = id;
    }

    @Override
    public String toString(){
        return "Student" + "("+"id= "+id+")"+ firstName+" "+lastName+" "+" Grade = "+score;
    }


}
