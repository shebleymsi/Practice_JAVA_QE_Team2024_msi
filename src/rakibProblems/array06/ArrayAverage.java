package rakibProblems.array06;

    public class ArrayAverage {
        public static void main(String[] args) {
            double[] array = {1.5, 2.5, 3.5, 4.5, 5.5};
            double sum = 0;

            for (double num : array) {
                sum += num;
            }

            double average = sum / array.length;

            System.out.println("Average of array elements: " + average);
        }
    }