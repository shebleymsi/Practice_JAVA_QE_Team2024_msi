package XQE_JavaMathNotebook;

public class QE17_LearnCubeOfNumber {

    public static void main(String[] args) {

        String number = "3 2 1";
        number = number.replaceAll("\\s+", "");

        for (int i = 0; i < number.length(); i++) {
            int num = Character.getNumericValue(number.charAt(i));
            int cube = num * num * num;
            System.out.println(cube);
        }
    }
}
