package w3_JAVA.java_How_To;

public class How_To_11_Loop_Through_an_Enum {

    enum Level {
        SUNDAY, MONDAY, TUESDAY
    }

    public static void main(String[] args) {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);

        }

    }
}
//The enum type has a values() method, which returns an array of all enum constants.
//This method is useful when you want to loop through the constants of an enum: