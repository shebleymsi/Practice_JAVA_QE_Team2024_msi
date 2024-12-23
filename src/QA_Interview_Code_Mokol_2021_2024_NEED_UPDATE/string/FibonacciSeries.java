package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.string;

public class FibonacciSeries {
    public static void main(String[] args) {
        int x1=0;
        int x2=1;
        int n= 10;
        int fibo;
        System.out.print(x1+" "+ x2);
        for (int i=0;i<n;i++){
            fibo=x1+x2;
            System.out.print(" "+fibo+ " ");
            x1=x2;
            x2=fibo;
        }
    }
}
