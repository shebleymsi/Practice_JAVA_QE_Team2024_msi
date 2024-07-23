package Practice_Lecture_LearnJava_QE_Winter2022_.learnJava_14_doEnum;

public enum LEVEL {

    HIGH, MEDIUM, LOW;

    int age; // variable possible to create in enum
    static final String name = "Wasee";

    public static final String levelInfo() {  // should return type of method
        System.out.println("This is level info");
        //  return false;
        return "Bob";
    }

}
