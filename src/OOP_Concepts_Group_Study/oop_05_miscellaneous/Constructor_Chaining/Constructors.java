package OOP_Concepts_Group_Study.oop_05_miscellaneous.Constructor_Chaining;

public class Constructors {

    int a,b,c,d,e;

    public Constructors() {
        System.out.println("This is default constructor: " + "Msi");
    }

    // Constructor 1: Takes one parameter 'a'
    public Constructors(int a) {
        this();
        this.a = a;
        System.out.println("Print by using the concepts of C Chaining: " +"Rakib");
    }

    // Constructor 2: Takes one parameter 'b' and calls the first constructor
    public Constructors(int a, int b) {
        this(a); // Calls the first constructor
        this.b = b;
    }

    // Constructor 3: Takes one parameter 'c' and calls the second constructor
    public Constructors(int a, int b, int c) {
        this(a, b); // Calls the second constructor
        this.c = c;
    }

    public Constructors(int a, int b, int c, int d) {

        this(a, b, c);
        this.d = d;
    }

    public Constructors(int a, int b, int c, int d, int e) {

        this(a, b, c, d);
        this.e = e;


    }

    public void add (){

        System.out.println("by method: " + (a+b+c+d+e));
    }

}
