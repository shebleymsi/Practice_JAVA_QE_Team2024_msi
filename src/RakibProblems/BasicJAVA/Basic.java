package RakibProblems.BasicJAVA;

public class Basic {

    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        main(a);
        main(a, b);

    }

    public static int main(int a) {
        System.out.println(a);
        return a;
    }

    public static int main(int a, int b) {
        int x = a + b;
        System.out.println(x);
        return x;
    }

}

