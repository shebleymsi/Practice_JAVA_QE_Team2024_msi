package rakibProblems.variable02;

public class ScopeExample02 {

        // Instance variable
        int instanceVariable = 10;

        // Class/Static variable
        static int staticVariable = 20;

        public void method() {
            // Local variable
            int localVariable = 30;
            System.out.println("Local Variable: " + localVariable);
            System.out.println("Instance Variable: " + instanceVariable);
            System.out.println("Static Variable: " + staticVariable);
        }

        public static void main(String[] args) {
            ScopeExample02 obj = new ScopeExample02();
            obj.method();

            // Accessing static variable without an object
            System.out.println("Static Variable: " + ScopeExample02.staticVariable);
        }
    }


