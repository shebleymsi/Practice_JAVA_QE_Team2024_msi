package QA_InterviewCode_Capital_One_Bank_2021_2024.string;
public class PalindromeNumber {
    public static void main(String[] args) {
        int remainder;
        int reverse=0;
        int num=12121;
        int temp=num;

        while(temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp/10;
        }
        if(num == reverse){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }
}

