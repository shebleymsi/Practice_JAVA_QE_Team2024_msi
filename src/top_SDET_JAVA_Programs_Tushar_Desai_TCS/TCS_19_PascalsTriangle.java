package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_19_PascalsTriangle {
    //19. Print the Pascal's Triangle
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int num = 1;
            System.out.format("%" + (rows - i) * 2 + "s", "");  for (int j = 0; j <= i; j++) {
                System.out.format("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

}
