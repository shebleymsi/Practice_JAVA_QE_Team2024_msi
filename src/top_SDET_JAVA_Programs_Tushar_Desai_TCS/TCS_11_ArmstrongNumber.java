package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_11_ArmstrongNumber {
    //11. Check if a Number is Armstrong
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        System.out.println(num == sum);
    }

}
