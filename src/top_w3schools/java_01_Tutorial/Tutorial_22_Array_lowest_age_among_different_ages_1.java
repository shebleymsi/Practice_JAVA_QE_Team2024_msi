package top_w3schools.java_01_Tutorial;

public class Tutorial_22_Array_lowest_age_among_different_ages_1 {
    public static void main(String[] args) {

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int lowestAge = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (lowestAge > ages[i]) {
                lowestAge = ages[i];
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}
