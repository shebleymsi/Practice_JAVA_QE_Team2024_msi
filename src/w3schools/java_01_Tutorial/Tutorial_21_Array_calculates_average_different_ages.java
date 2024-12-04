package w3schools.java_01_Tutorial;

public class Tutorial_21_Array_calculates_average_different_ages {
    public static void main(String[] args) {

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        for (int age : ages) {
            sum = sum + age; //sum +=;
        }
        System.out.println(sum);

        avg = sum / ages.length;
        System.out.println("The average age is: " + avg);
    }
}

//let's create a program that calculates the average of different ages: