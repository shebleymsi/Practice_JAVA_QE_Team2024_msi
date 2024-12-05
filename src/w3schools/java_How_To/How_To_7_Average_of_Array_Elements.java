package w3schools.java_How_To;

public class How_To_7_Average_of_Array_Elements {
    public static void main(String[] args) {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

        float sum = 0;
        for (int age : ages) {
            sum = sum + age;
        }
        System.out.println(sum);

        int totalElement = ages.length;

        float avg = sum / totalElement;
        System.out.println(avg);

    }
}
