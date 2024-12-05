package w3schools.java_How_To;

public class How_To_8_Find_Smallest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        int lowestAge = ages[0];
        for (int age : ages) {
            if(lowestAge > age){
                lowestAge = age;
            }
        }
        System.out.println(lowestAge);

    }
}
