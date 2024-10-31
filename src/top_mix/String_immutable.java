package top_mix;

public class String_immutable {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.concat(" World"); // Assign the result to str
        System.out.println(str); // This will now print "Hello World"
    }
}
